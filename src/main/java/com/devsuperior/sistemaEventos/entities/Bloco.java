package com.devsuperior.sistemaEventos.entities;

import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_bloco")
public class Bloco {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)	
		private Integer id;
		
		@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
		private Instant inicio;
		
		@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
		private Instant fim;
		
		@OneToOne
		@MapsId("atividade_id")
		private Atividade atividade;

		public Bloco() {

		}

		public Bloco(Integer id, Instant inicio, Instant fim) {
			this.id = id;
			this.inicio = inicio;
			this.fim = fim;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Instant getInicio() {
			return inicio;
		}

		public void setInicio(Instant inicio) {
			this.inicio = inicio;
		}

		public Instant getFim() {
			return fim;
		}

		public void setFim(Instant fim) {
			this.fim = fim;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bloco other = (Bloco) obj;
			return Objects.equals(id, other.id);
		}
		
		
		
}