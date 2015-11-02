package br.com.jprojetos.controlrooms.service;

import java.util.List;

import br.com.jprojetos.controlrooms.entity.Sala;
import br.com.jprojetos.controlrooms.exception.SalaJaExistenteException;
import br.com.jprojetos.controlrooms.exception.SalaNaoExistenteException;

public interface SalaService {
	
	public void save(Sala sala) throws SalaJaExistenteException;
	public Sala getById(int id);
	public Sala getByNumSala(int numeroSala);
	public List<Sala> listAll();
	void deleteById(int id) throws SalaNaoExistenteException;
	void delete(Sala sala);
	void update(Sala sala); 

}
