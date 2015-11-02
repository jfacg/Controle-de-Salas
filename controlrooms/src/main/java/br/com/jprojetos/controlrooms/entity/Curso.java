package br.com.jprojetos.controlrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	 * Class constructor method
	 * 
	 * @param nomeCurso
	 * @param coordenador
	 */
	public Curso(String nomeCurso, String coordenador) {
		super();
		this.nomeCurso = nomeCurso;
		this.coordenador = coordenador;
	}

	/**
	 * Getter method
	 * 
	 * @return the nomeCurso
	 */
	public String getNomeCurso() {
		return nomeCurso;
	}

	/**
	 * Setter method
	 * 
	 * @param nomeCurso
	 *            the nomeCurso to set
	 */
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	/**
	 * Getter method
	 * 
	 * @return the descricaoCurso
	 */
	public String getDescricaoCurso() {
		return descricaoCurso;
	}

	/**
	 * Setter method
	 * 
	 * @param descricaoCurso
	 *            the descricaoCurso to set
	 */
	public void setDescricaoCurso(String descricaoCurso) {
		this.descricaoCurso = descricaoCurso;
	}

	/**
	 * Getter method
	 * 
	 * @return the coordenador
	 */
	public String getCoordenador() {
		return coordenador;
	}

	/**
	 * Setter method
	 * 
	 * @param coordenador
	 *            the coordenador to set
	 */
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	/**
	 * Getter method
	 * 
	 * @return the instituicao
	 */
//	public Instituicao getInstituicao() {
//		return instituicao;
//	}

	/**
	 * Setter method
	 * 
	 * @param instituicao
	 *            the instituicao to set
//	 */
//	public void setInstituicao(Instituicao instituicao) {
//		this.instituicao = instituicao;
//	}

	/**
	 * Getter method
	 * 
	 * @return the idCruso
	 */
	public int getIdCruso() {
		return idCruso;
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
