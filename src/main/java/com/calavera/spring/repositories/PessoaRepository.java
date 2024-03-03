package com.calavera.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calavera.spring.entities.Pessoa;

// Um repositório Spring Data JPA facilita o acesso e manipulação de dados da entidades
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
