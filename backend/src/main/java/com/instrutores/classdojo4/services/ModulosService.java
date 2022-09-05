package com.instrutores.classdojo4.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instrutores.classdojo4.dto.ModulosDTO;
import com.instrutores.classdojo4.entities.Modulos;
import com.instrutores.classdojo4.repositories.ModulosRepository;

@Service
public class ModulosService {
	@Autowired
	private ModulosRepository repository;
	
	public List<ModulosDTO> findAll(){
		List<Modulos> result = repository.findAll();
		return result.stream().map(x-> new ModulosDTO (x)).collect(Collectors.toList());
	}
}
