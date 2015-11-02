package br.com.jprojetos.controlrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

		/** 
		 * Getter method
		 * @return the intituicao
		 */
//		public Instituicao getIntituicao() {
//			return intituicao;
//		}

		/**
		 * Setter method
		 * @param intituicao the intituicao to set
		 */
//		public void setIntituicao(Instituicao intituicao) {
//			this.intituicao = intituicao;
//		}

		@Override
		public String toString() {
			return "Sala [idSala=" + idSala + ", numeroSala=" + numeroSala + ", andar=" + andarSala + ", descricao="
					+ descricaoSala + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + numeroSala;
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
			Sala other = (Sala) obj;
			if (numeroSala != other.numeroSala)
				return false;
			return true;
		}






}
