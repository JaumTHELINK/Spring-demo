package com.turmaa.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;


import com.turmaa.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
