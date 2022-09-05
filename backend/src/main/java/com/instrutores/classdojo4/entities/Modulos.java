package com.instrutores.classdojo4.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "modulos")
public class Modulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	@OneToMany(mappedBy = "modulo")
	private List<Aulas> aulas = new ArrayList<>();
	
	public Modulos() {
		// TODO Auto-generated constructor stub
	}

	public Modulos(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public List<Aulas> getAulas() {
		return aulas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}