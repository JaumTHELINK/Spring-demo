package com.turmaa.helpdesk.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turmaa.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
