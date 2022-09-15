package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor setor1 = new Setor("RH", 123);
		Setor setor2 = new Setor("DP", 789);
	
		Pessoa pessoa1 = new Pessoa("Paulo", "987442515", "paulo@gmail.com", EstadoCivil.CASADO, setor1);
		Pessoa pessoa2 = new Pessoa("Guilherme", "921242515", "guilherme@gmail.com", EstadoCivil.SOLTEIRO, setor2);

		System.out.println(pessoa1 + "\n" + pessoa2);
	
		for (EstadoCivil situacao : EstadoCivil.values()) {
			System.out.println(situacao);
		}
	}

}
