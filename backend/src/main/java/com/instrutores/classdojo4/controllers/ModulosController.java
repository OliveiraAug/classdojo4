package com.instrutores.classdojo4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instrutores.classdojo4.dto.ModulosDTO;
import com.instrutores.classdojo4.services.ModulosService;

@RestController
@RequestMapping(value = "/modulos")
public class ModulosController {
	@Autowired
	private ModulosService service;	
	@GetMapping
	public ResponseEntity<List<ModulosDTO>> findAll(){
		
		List<ModulosDTO> list = service.findAll();
		return ResponseEntity.ok(list);
		
	}

}
