package com.instrutores.classdojo4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "aulas")
public class Aulas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "modulo_id")
	private Modulos modulo;
	
	public Aulas() {
		// TODO Auto-generated constructor stub
	}
	public Aulas(int id, String nome, String descricao, Modulos modulo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.modulo = modulo;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Modulos getModulo() {
		return modulo;
	}
	public void setModulo(Modulos modulo) {
		this.modulo = modulo;
	}
	
	

}
