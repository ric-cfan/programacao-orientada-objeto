package br.edu.senai.exemplos;

import java.util.Optional;

import br.edu.senai.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario(1, "Carlos", null, 2500.);
		Optional<Funcionario> funcionario2 = null;
		
		System.out.println(funcionario1.getNome());
		
		if(funcionario2.isPresent()) {
			System.out.println(funcionario2.get().getNome());
		} else {
			System.out.println("Não instanciou !");
		}
	}
}
