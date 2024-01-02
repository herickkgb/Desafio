package com.herick.lojavirtual.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Participante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@Column(unique = true)
	private String email;
	@ManyToMany
	private List<Atividade> Atividades = new ArrayList<>();


	public Participante() {
		super();
	}

	public Participante(Integer id, String nome, String email, List<Atividade> atividades) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.Atividades = atividades;
	}


	public Integer getId() {
		return id;
	}

	public String getName() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public List<Atividade> getAtividades() {
		return Atividades;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Participante other = (Participante) obj;
		return Objects.equals(id, other.id);
	}

}
