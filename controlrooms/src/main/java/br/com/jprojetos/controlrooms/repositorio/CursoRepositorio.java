package br.com.jprojetos.controlrooms.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.jprojetos.controlrooms.entity.Curso;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Integer>{
	
	
	public final static String FIND_BY_ID = "SELECT p FROM Curso p WHERE p.idCurso = :id";
	public final static String FIND_BY_NOME_CURSO = "SELECT p FROM Curso p WHERE p.nomeCurso = :nomeCurso";
	
	
	@Query(FIND_BY_ID)
	public Curso getById(@Param("id") int id);

	@Query(FIND_BY_NOME_CURSO)
	public Curso getByNome(@Param("nomeCurso") String nomeCurso);
}
