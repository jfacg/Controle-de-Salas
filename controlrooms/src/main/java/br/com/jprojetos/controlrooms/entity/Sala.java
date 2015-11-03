package br.com.jprojetos.controlrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int idSala;
		@Column(nullable=false)
		private int numeroSala;
		@Column(nullable=false)
		private int andarSala;
		@Column(nullable=false)
		private String descricaoSala;
		
//		@ManyToOne
//		@JoinColumn(name="instituicao_sala")
//		private Instituicao intituicao;
		
		/** 
		 * Getter method
		 * @return the idSala
		 */
		public int getIdSala() {
			return idSala;
		}

		/**
		 * Método setter
		 * @param idSala the idSala to set
		 */
		public void setIdSala(int idSala) {
			this.idSala = idSala;
		}



		/** 
		 * Getter method
		 * @return the numeroSala
		 */
		public int getNumeroSala() {
			return numeroSala;
		}

		/**
		 * Setter method
		 * @param numeroSala the numeroSala to set
		 */
		public void setNumeroSala(int numeroSala) {
			this.numeroSala = numeroSala;
		}

		/** 
		 * Getter method
		 * @return the andarSala
		 */
		public int getAndarSala() {
			return andarSala;
		}

		/**
		 * Setter method
		 * @param andarSala the andarSala to set
		 */
		public void setAndarSala(int andarSala) {
			this.andarSala = andarSala;
		}

		/** 
		 * Getter method
		 * @return the descricaoSala
		 */
		public String getDescricaoSala() {
			return descricaoSala;
		}

		/**
		 * Setter method
		 * @param descricaoSala the descricaoSala to set
		 */
		public void setDescricaoSala(String descricaoSala) {
			this.descricaoSala = descricaoSala;
		}

		@Override
		public String toString() {
			return "Sala [idSala=" + idSala + ", numeroSala=" + numeroSala + ", andar=" + andarSala + ", descricao="
					+ descricaoSala + "]";
		}

		
}
