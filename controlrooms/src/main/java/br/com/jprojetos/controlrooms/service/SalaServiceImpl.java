package br.com.jprojetos.controlrooms.service;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import br.com.jprojetos.controlrooms.entity.Sala;
import br.com.jprojetos.controlrooms.exception.SalaJaExistenteException;
import br.com.jprojetos.controlrooms.exception.SalaNaoExistenteException;
import br.com.jprojetos.controlrooms.repositorio.SalaRepositorio;

@Service
@Validated
public class SalaServiceImpl implements SalaService {
		
	private final SalaRepositorio salaRepositorio;

	@Inject
	public SalaServiceImpl (final SalaRepositorio salaRepositorio){
		this.salaRepositorio = salaRepositorio;
	}
	
	@Override
	@Transactional
	public void save(@NotNull @Valid Sala sala) throws SalaJaExistenteException{
		Sala existente = getByNumSala(sala.getNumeroSala());
		
		if(existente != null){
			throw new SalaJaExistenteException();
		}
		salaRepositorio.save(sala);
	}
	
	@Override
	@Transactional
	public void update(@NotNull @Valid Sala sala){
		Sala existente = getByNumSala(sala.getNumeroSala());
		existente.setAndarSala(sala.getAndarSala());
		existente.setDescricaoSala(sala.getDescricaoSala());
		existente.setNumeroSala(sala.getNumeroSala());
		salaRepositorio.save(existente);
	}
	

	@Override
	public Sala getByNumSala(int numeroSala){
		return salaRepositorio.getByNumSala(numeroSala);
	}
	
	@Override
	public Sala getById(int id) {
		return salaRepositorio.getById(id);  
	}

	@Override
	public void delete (Sala sala){
		salaRepositorio.delete(sala);
	}
	
	@Override
	public void deleteById(int id) throws SalaNaoExistenteException {
		Sala sala = getById(id);
		if(sala != null){
			delete(sala);
		} else {
			throw new SalaNaoExistenteException();
		}
	}

	@Override
	public List<Sala> listAll() {
		return (List<Sala>) salaRepositorio.findAll();
	}



}
