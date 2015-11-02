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

import br.com.jprojetos.controlrooms.entity.Sala;
import br.com.jprojetos.controlrooms.exception.SalaAlreadyExistsException;
import br.com.jprojetos.controlrooms.exception.SalaJaExistenteException;
import br.com.jprojetos.controlrooms.exception.SalaNaoExistenteException;
import br.com.jprojetos.controlrooms.service.SalaService;

@RestController
public class SalaController {

	// private final ParticipantService participantService;
	//
	// @Inject
	// public ParticipantController(final ParticipantService participantService)
	// {
	// this.participantService = participantService;
	// }
	private final SalaService salaService;

	@Inject
	public SalaController(final SalaService salaService) {
		this.salaService = salaService;
	}

	@RequestMapping(value = "/sala", method = RequestMethod.GET)
	public ResponseEntity<List<Sala>> listAll() {
		return new ResponseEntity<List<Sala>>(salaService.listAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/sala/{id}", method = RequestMethod.GET)
	public ResponseEntity<Sala> getById(@PathVariable int id){
		Sala sala = salaService.getById(id);
		return sala == null? 
				new ResponseEntity<Sala>(HttpStatus.NOT_FOUND):
				 new ResponseEntity<Sala>(sala, HttpStatus.OK);
				
	}

	@RequestMapping(value = "/sala/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Sala> deleteById(@PathVariable int id){
		try {
			salaService.deleteById(id);
			return 	new ResponseEntity<Sala>(HttpStatus.OK);	
		} catch (SalaNaoExistenteException e) {
			return new ResponseEntity<Sala>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/sala", method = RequestMethod.POST)
	public ResponseEntity<String> saveSala(@RequestBody Sala sala) throws SalaAlreadyExistsException {

		try {
			salaService.save(sala);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		} catch (SalaJaExistenteException e) {
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
