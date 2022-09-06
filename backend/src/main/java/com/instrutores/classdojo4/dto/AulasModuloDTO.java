package com.instrutores.classdojo4.dto;

import java.io.Serializable;

import com.instrutores.classdojo4.entities.Modulos;

public class AulasModuloDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String moduloNome;
	private String aulaNome;
	
	public AulasModuloDTO() {
		// TODO Auto-generated constructor stub
	}

	public AulasModuloDTO(Modulos modulo, String aulaNome) {
		this.moduloNome = modulo.getNome();
		this.aulaNome = aulaNome;
	}

	public String getModuloNome() {
		return moduloNome;
	}

	public void setModuloNome(String moduloNome) {
		this.moduloNome = moduloNome;
	}

	public String getAulaNome() {
		return aulaNome;
	}

	public void setAulaNome(String aulaNome) {
		this.aulaNome = aulaNome;
	}
	

}
