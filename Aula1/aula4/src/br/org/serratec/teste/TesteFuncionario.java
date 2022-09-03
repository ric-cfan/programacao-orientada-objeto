package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Roberto", 5000.90, "Financeiro");
		System.out.println("Dados: " + gerente.getNome() + "\n" + gerente.getSalario());
		
		Assistente assistente = new Assistente("321", "Robert", 500., "Financeiro");
		System.out.println("Dados: " + assistente.getNome() + "\n" + assistente.getSalario());
	}

}
