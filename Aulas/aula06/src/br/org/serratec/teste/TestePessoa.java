package br.org.serratec.teste;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jô", 3000.);
		
		System.out.println(pessoa.toString() + " Imposto de Renda:" + pessoa.calcularImpostoDeRenda());
		
	}

}
