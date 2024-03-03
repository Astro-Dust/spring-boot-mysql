package com.calavera.spring.services;

import com.calavera.spring.entities.Pessoa;
import com.calavera.spring.repositories.PessoaRepository;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class PopulateDB {

    private final PessoaRepository pessoaRepository;

    public PopulateDB(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @PostConstruct
    private void initDatabase() {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setDataNascimento(Date.valueOf("1990-01-01"));
        pessoa1.setSexo("Masculino");
        pessoaRepository.save(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setDataNascimento(Date.valueOf("1995-05-05"));
        pessoa2.setSexo("Feminino");
        pessoaRepository.save(pessoa2);
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Lucia");
        pessoa3.setDataNascimento(Date.valueOf("1997-01-24"));
        pessoa3.setSexo("Feminino");
        pessoaRepository.save(pessoa3);
    }
}
