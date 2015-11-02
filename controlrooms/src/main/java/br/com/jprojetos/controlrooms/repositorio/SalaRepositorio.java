package br.com.jprojetos.controlrooms.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.jprojetos.controlrooms.entity.Sala;

@Repository
public interface SalaRepositorio extends JpaRepository<Sala, Integer> {

	public final static String FIND_BY_ID = "SELECT p FROM Sala p WHERE p.idSala = :id";
	public final static String FIND_BY_NUM_SALA = "SELECT p FROM Sala p WHERE p.numeroSala = :numeroSala";
	
	
	@Query(FIND_BY_ID)
	public Sala getById(@Param("id") int id);
	
	@Query(FIND_BY_NUM_SALA)
	public Sala getByNumSala(@Param("numeroSala") int numeroSala);
	
	

	
}
