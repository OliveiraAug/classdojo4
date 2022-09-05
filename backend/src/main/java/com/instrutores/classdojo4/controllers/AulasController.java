package com.instrutores.classdojo4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instrutores.classdojo4.dto.AulasDTO;
import com.instrutores.classdojo4.services.AulasService;

@RestController
@RequestMapping(value = "/aulas")
public class AulasController {
	@Autowired
	private AulasService service;	
	@GetMapping
	public ResponseEntity<Page<AulasDTO>> findAll(Pageable pageable){
		
		Page<AulasDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}

}
