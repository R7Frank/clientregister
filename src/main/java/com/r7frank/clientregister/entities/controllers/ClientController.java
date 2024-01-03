package com.r7frank.clientregister.entities.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r7frank.clientregister.entities.Client;
import com.r7frank.clientregister.repositories.ClientRepository;

@RestController
@RequestMapping(value="/clients")
public class ClientController {

	List<Client> clientes = new ArrayList<>();
	
	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> findAll() {
		clientes = clientRepository.findAll();
		return clientes;
	}
	
}
