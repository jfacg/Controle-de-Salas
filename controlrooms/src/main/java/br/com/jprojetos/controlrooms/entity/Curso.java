package br.com.jprojetos.controlrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCurso;
	@Column(nullable = false)
	private String nomeCurso;
	@Column(nullable = false)
	private String descricaoCurso;
	@Column(nullable = false)
	private String coordenador;
	
	
	/**
	 * Método getter
	 * @return the idCurso
	 */
	public int getIdCruso() {
		return idCurso;
	}
	/**
	 * Método setter
	 * @param idCurso the idCurso to set
	 */
	public void setIdCruso(int idCurso) {
		this.idCurso = idCurso;
	}
	/**
	 * Método getter
	 * @return the nomeCurso
	 */
	public String getNomeCurso() {
		return nomeCurso;
	}
	/**
	 * Método setter
	 * @param nomeCurso the nomeCurso to set
	 */
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	/**
	 * Método getter
	 * @return the descricaoCurso
	 */
	public String getDescricaoCurso() {
		return descricaoCurso;
	}
	/**
	 * Método setter
	 * @param descricaoCurso the descricaoCurso to set
	 */
	public void setDescricaoCurso(String descricaoCurso) {
		this.descricaoCurso = descricaoCurso;
	}
	/**
	 * Método getter
	 * @return the coordenador
	 */
	public String getCoordenador() {
		return coordenador;
	}
	/**
	 * Método setter
	 * @param coordenador the coordenador to set
	 */
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}
	
	
	
	
}
