package br.com.jprojetos.controlrooms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;





@Entity
public class Instituicao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idInstituicao;
	@Column(nullable = false)
	private String nomeInstituicao;

//	private List<Sala> salas;
	
	
	
	
	/**
	 * Método getter
	 * @return the idInstituicao
	 */
	public int getIdInstituicao() {
		return idInstituicao;
	}
	/**
	 * Método setter
	 * @param idInstituicao the idInstituicao to set
	 */
	public void setIdInstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}
	/**
	 * Método getter
	 * @return the nomeInstituicao
	 */
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	/**
	 * Método setter
	 * @param nomeInstituicao the nomeInstituicao to set
	 */
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

}
