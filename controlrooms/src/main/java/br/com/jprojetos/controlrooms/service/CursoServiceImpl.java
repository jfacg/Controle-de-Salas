package br.com.jprojetos.controlrooms.service;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import br.com.jprojetos.controlrooms.entity.Curso;
import br.com.jprojetos.controlrooms.exception.CursoJaExistenteException;
import br.com.jprojetos.controlrooms.exception.CursoNaoExistenteException;
import br.com.jprojetos.controlrooms.repositorio.CursoRepositorio;

@Service
@Validated
public class CursoServiceImpl implements CursoService {

	private final CursoRepositorio cursoRepositorio;

	@Inject
	public CursoServiceImpl(final CursoRepositorio cursoRepositorio) {
		this.cursoRepositorio = cursoRepositorio;
	}

	@Override
	@Transactional
	public void save(@NotNull @Valid Curso curso) throws CursoJaExistenteException {
		Curso existente = getByNome(curso.getNomeCurso());

		if (existente != null) {
			throw new CursoJaExistenteException();
		}
		cursoRepositorio.save(curso);
	}

	@Override
	@Transactional
	public void update(@NotNull @Valid Curso curso) {
		Curso existente = getByNome(curso.getNomeCurso());
		existente.setNomeCurso(curso.getNomeCurso());
		existente.setDescricaoCurso(curso.getDescricaoCurso());
		existente.setCoordenador(curso.getCoordenador());
		cursoRepositorio.save(existente);
	}

	@Override
	public Curso getById(int id) {
		return cursoRepositorio.getById(id);
	}

	@Override
	public void delete(Curso curso) {
		cursoRepositorio.delete(curso);
	}

	@Override
	public void deleteById(int id) throws CursoNaoExistenteException {
		Curso curso = getById(id);
		if (curso != null) {
			delete(curso);
		} else {
			throw new CursoNaoExistenteException();
		}
	}

	@Override
	public List<Curso> listAll() {
		return (List<Curso>) cursoRepositorio.findAll();
	}

	@Override
	public Curso getByNome(String nomeCurso) {

		return cursoRepositorio.getByNome(nomeCurso);
	}

}
