package com.calavera.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello, World!";
	}
	
}
