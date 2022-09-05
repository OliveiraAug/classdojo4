package com.instrutores.classdojo4.dto;

import com.instrutores.classdojo4.entities.Aulas;

public class AulasDTO {
	private int id;
	private String nome;
	private String descricao;
	
	private ModulosDTO modulo;
	
	 public AulasDTO() {
		// TODO Auto-generated constructor stub
	}

	public AulasDTO(int id, String nome, String descricao, ModulosDTO modulo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.modulo = modulo;
	}
	
	public AulasDTO(Aulas entity) {
		id = entity.getId();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		modulo = new ModulosDTO(entity.getModulo());
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

	public ModulosDTO getModulo() {
		return modulo;
	}

	public void setModulo(ModulosDTO modulo) {
		this.modulo = modulo;
	}
	 
	 

}
