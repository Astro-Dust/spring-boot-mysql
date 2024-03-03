package com.calavera.spring.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // cria uma tabela no BD chamado Pessoa
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Date dataNascimento;
	private String sexo;
	
//	public Pessoa(String nome, Date dataNascimento, String sexo) {
//		super();
//		this.nome = nome;
//		this.dataNascimento = dataNascimento;
//		this.sexo = sexo;
//	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
