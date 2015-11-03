package br.com.jprojetos.controlrooms.service;

import java.util.List;

import br.com.jprojetos.controlrooms.entity.Curso;
import br.com.jprojetos.controlrooms.exception.CursoJaExistenteException;
import br.com.jprojetos.controlrooms.exception.CursoNaoExistenteException;

public interface CursoService {
	
	public void save(Curso curso) throws CursoJaExistenteException;
	public Curso getById(int id);
	public Curso getByNome(String nomeCurso);
	public List<Curso> listAll();
	void deleteById(int id) throws CursoNaoExistenteException;
	void delete(Curso curso);
	void update(Curso curso); 

}
