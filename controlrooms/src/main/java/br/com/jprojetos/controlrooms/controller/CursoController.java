package br.com.jprojetos.controlrooms.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jprojetos.controlrooms.entity.Curso;
import br.com.jprojetos.controlrooms.exception.CursoJaExistenteException;
import br.com.jprojetos.controlrooms.exception.CursoNaoExistenteException;
import br.com.jprojetos.controlrooms.service.CursoService;

@RestController
public class CursoController {

	private final CursoService cursoService;

	@Inject
	public CursoController(final CursoService cursoService) {
		this.cursoService = cursoService;
	}

	@RequestMapping(value = "/curso", method = RequestMethod.GET)
	public ResponseEntity<List<Curso>> listAll() {
		return new ResponseEntity<List<Curso>>(cursoService.listAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/curso/{id}", method = RequestMethod.GET)
	public ResponseEntity<Curso> getById(@PathVariable int id){
		Curso curso = cursoService.getById(id);
		return curso == null? 
				new ResponseEntity<Curso>(HttpStatus.NOT_FOUND):
				 new ResponseEntity<Curso>(curso, HttpStatus.OK);
				
	}

	@RequestMapping(value = "/curso/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Curso> deleteById(@PathVariable int id){
		try {
			cursoService.deleteById(id);
			return 	new ResponseEntity<Curso>(HttpStatus.OK);	
		} catch (CursoNaoExistenteException e) {
			return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/curso", method = RequestMethod.POST)
	public ResponseEntity<String> saveCurso(@RequestBody Curso curso){

		try {
			cursoService.save(curso);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		} catch (CursoJaExistenteException e) {
			cursoService.update(curso);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
