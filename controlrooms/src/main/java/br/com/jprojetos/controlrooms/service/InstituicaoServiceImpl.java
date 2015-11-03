package br.com.jprojetos.controlrooms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import br.com.jprojetos.controlrooms.entity.Curso;
import br.com.jprojetos.controlrooms.entity.Instituicao;
import br.com.jprojetos.controlrooms.exception.InstituicaoJaExistenteException;
import br.com.jprojetos.controlrooms.repositorio.InstituicaoRepositorio;

@Service
public class InstituicaoServiceImpl implements InstituicaoService {
	private static int ID_UNICO = 1;
	private final InstituicaoRepositorio instituicaoRepositorio;

	@Inject
	public InstituicaoServiceImpl(final InstituicaoRepositorio instituicaoRepositorio) {
		this.instituicaoRepositorio = instituicaoRepositorio;
	}

	@Override
	public void save(Instituicao instituicao) {
		Instituicao existente = instituicaoRepositorio.getOne(ID_UNICO);

		if (existente == null) {
			instituicaoRepositorio.save(instituicao);
		} else {
			existente.setNomeInstituicao(instituicao.getNomeInstituicao());
			instituicaoRepositorio.save(existente);
		}
	}

	@Override
	public void delete(Instituicao instituicao) {
		instituicaoRepositorio.delete(instituicao);
	}
	
	@Override
	public List<Instituicao> listAll() {
		return (List<Instituicao>) instituicaoRepositorio.findAll();
	}
}
