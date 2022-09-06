package com.instrutores.classdojo4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.instrutores.classdojo4.dto.AulasModuloDTO;
import com.instrutores.classdojo4.dto.DescricaoAulasModuloDTO;
import com.instrutores.classdojo4.entities.Aulas;

public interface AulasRepository extends JpaRepository<Aulas, Integer>{
	@Query("SELECT new com.instrutores.classdojo4.dto.AulasModuloDTO(obj.modulo, obj.nome) "
			+ " FROM  com.instrutores.classdojo4.entities.Aulas AS obj GROUP BY obj.nome")
	List<AulasModuloDTO> listGroupedByModulo();
	
	@Query("SELECT new com.instrutores.classdojo4.dto.DescricaoAulasModuloDTO(obj) "
			+ " FROM  com.instrutores.classdojo4.entities.Aulas AS obj GROUP BY obj")
	List<DescricaoAulasModuloDTO> listDescriptionGroupedByAulas();

}
