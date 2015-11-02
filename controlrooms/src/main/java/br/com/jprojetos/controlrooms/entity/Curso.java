package br.com.jprojetos.controlrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCruso;
	@Column(nullable = false)
	private String nomeCurso;
	@Column(nullable = false)
	private String descricaoCurso;
	@Column(nullable = false)
	private String coordenador;

	// @ManyToOne
	// @JoinColumn(name="instituicao_curso")
//	private Instituicao instituicao;

	
	/**
	 * Método getter
	 * @return the idCruso
	 */
	public int getIdCruso() {
		return idCruso;
	}

	/**
	 * Método setter
	 * @param idCruso the idCruso to set
	 */
	public void setIdCruso(int idCruso) {
		this.idCruso = idCruso;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCurso == null) ? 0 : nomeCurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (nomeCurso == null) {
			if (other.nomeCurso != null)
				return false;
		} else if (!nomeCurso.equals(other.nomeCurso))
			return false;
		return true;
	}
}
