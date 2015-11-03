package br.com.jprojetos.controlrooms.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.jprojetos.controlrooms.entity.Instituicao;
import br.com.jprojetos.controlrooms.service.InstituicaoService;

@Controller
public class InstituicaoController {
	
	private final InstituicaoService instituicaoService;
	
	@Inject
	public InstituicaoController (final InstituicaoService instituicaoService){
		this.instituicaoService = instituicaoService;
	}
	
	@RequestMapping(value = "/instituicao", method = RequestMethod.GET)
	public ResponseEntity<List<Instituicao>> listAll() {
		return new ResponseEntity<List<Instituicao>>(instituicaoService.listAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/instituicao", method = RequestMethod.POST)
	public ResponseEntity<String> saveInstituicao(@RequestBody Instituicao instituicao){

		instituicaoService.save(instituicao);
			return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
