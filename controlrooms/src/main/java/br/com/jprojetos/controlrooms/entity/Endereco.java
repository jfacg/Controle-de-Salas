package br.com.jprojetos.controlrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEndereco;
	@Column(nullable=false)
	private String endereco;
	@Column(nullable=false)
	private String cidade;
	@Column(nullable=false)
	private String estado;
	private String cep;
	
////	@OneToOne
//	@JoinColumn(name="instituicao_endereco")
//	private Instituicao instituicao;
	
	/**
	 * Class constructor method
	 * @param endereco
	 * @param cidade
	 * @param estado
	 * @param cep
	 */
	public Endereco(String endereco, String cidade, String estado, String cep) {
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	/** 
	 * Getter method
	 * @return the idEndereco
	 */
	public int getIdEndereco() {
		return idEndereco;
	}

	/**
	 * Setter method
	 * @param idEndereco the idEndereco to set
	 */
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	/** 
	 * Getter method
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Setter method
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/** 
	 * Getter method
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Setter method
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/** 
	 * Getter method
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter method
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/** 
	 * Getter method
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Setter method
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/** 
	 * Getter method
	 * @return the instituicao
	 */
//	public Instituicao getInstituicao() {
//		return instituicao;
//	}

	/**
	 * Setter method
	 * @param instituicao the instituicao to set
	 */
//	public void setInstituicao(Instituicao instituicao) {
//		this.instituicao = instituicao;
//	}

	/** 
	 * toString method
	 * @return the String
	 */
	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", endereco=" + endereco + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + "]";
	}

	/** 
	 * hashCode method
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEndereco;
		return result;
	}

	/** 
	 * equals method
	 * @return the boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (idEndereco != other.idEndereco)
			return false;
		return true;
	}
	
}
