package com.calavera.spring.business;

import com.calavera.spring.entities.Pessoa;

// para operações de negócio
public class PessoaBusiness {

	void mudarSexo(Pessoa pessoa, String novoSexo, String novoNome) {
		pessoa.setSexo(novoSexo);
		pessoa.setNome(novoNome);
	}
	
	void casar(Pessoa pessoa, String antigoSobrenome, String novoSobrenome) {
		pessoa.setNome(pessoa.getNome().replace(antigoSobrenome, novoSobrenome));
	}
	
}
