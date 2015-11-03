package br.com.jprojetos.controlrooms.service;

import java.util.List;

import br.com.jprojetos.controlrooms.entity.Instituicao;

public interface InstituicaoService {
	
	public void save(Instituicao instituicao);
	void delete(Instituicao instituicao);
	List<Instituicao> listAll();
}
