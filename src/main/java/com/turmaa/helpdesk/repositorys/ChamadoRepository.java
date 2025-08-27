package com.turmaa.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turmaa.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	
}
