package br.com.jprojetos.controlrooms.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jprojetos.controlrooms.entity.Instituicao;

@Repository
public interface InstituicaoRepositorio extends JpaRepository<Instituicao, Integer>{
	
	

}
