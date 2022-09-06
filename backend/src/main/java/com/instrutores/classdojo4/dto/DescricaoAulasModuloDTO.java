package com.instrutores.classdojo4.dto;

import java.io.Serializable;

import com.instrutores.classdojo4.entities.Aulas;

public class DescricaoAulasModuloDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String aulaDescricao;
	private String aulaNome;
	
	public DescricaoAulasModuloDTO() {
		// TODO Auto-generated constructor stub
	}


	public DescricaoAulasModuloDTO(Aulas aulas) {
		aulaDescricao = aulas.getDescricao();
		aulaNome = aulas.getNome();
	}


	public String getModuloNome() {
		return aulaDescricao;
	}

	public void setModuloNome(String moduloNome) {
		this.aulaDescricao = moduloNome;
	}

	public String getAulaNome() {
		return aulaNome;
	}

	public void setAulaNome(String aulaNome) {
		this.aulaNome = aulaNome;
	}
	

}
