package com.turmaa.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.turmaa.helpdesk.domain.Chamado;
import com.turmaa.helpdesk.domain.Cliente;
import com.turmaa.helpdesk.domain.Tecnico;
import com.turmaa.helpdesk.domain.enuns.Perfil;
import com.turmaa.helpdesk.domain.enuns.Prioridade;
import com.turmaa.helpdesk.domain.enuns.Status;
import com.turmaa.helpdesk.repositorys.ChamadoRepository;
import com.turmaa.helpdesk.repositorys.ClienteRepository;
import com.turmaa.helpdesk.repositorys.TecnicoRepository;

@SpringBootApplication
public class HelpdeskturmaaApplication implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskturmaaApplication.class, args);
	}
	
	public void run (String... args) throws Exception {
		Tecnico tec1= new Tecnico(null, "Bill Gates", "85734725334", "bill@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente (null,"Linus Torvalds", "12345678910", "linus@gmail.com", "123");
		
		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));
	}
}

