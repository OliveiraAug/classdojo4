package com.instrutores.classdojo4.dto;

import java.io.Serializable;

import com.instrutores.classdojo4.entities.Modulos;

public class ModulosDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	
	public ModulosDTO() {
	}
	
	public ModulosDTO(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public ModulosDTO(Modulos entity) {
		id = entity.getId();
		nome = entity.getNome();
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
