package com.instrutores.classdojo4.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instrutores.classdojo4.dto.AulasDTO;
import com.instrutores.classdojo4.entities.Aulas;
import com.instrutores.classdojo4.repositories.AulasRepository;
import com.instrutores.classdojo4.repositories.ModulosRepository;

@Service
public class AulasService {
	@Autowired
	private AulasRepository repository;
	
	@Autowired
	private ModulosRepository modulosRepository;
	
	@Transactional(readOnly = true)
	public Page<AulasDTO> findAll(Pageable pageable){
		modulosRepository.findAll();
		Page<Aulas> result = repository.findAll(pageable);
		return result.map(x-> new AulasDTO (x));
	}
}
