package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado emp1 = new Empregado("123", "Ronaldo");
		Empregado emp2 = new Empregado("123", "Roaldo");
		
		System.out.println(emp1);
		System.out.println(emp2);
		if(emp1.equals(emp2)) {
			System.out.println("CPFs Iguais!");
		} else {
			System.out.println("CPFs Diferentes!");
		}
		
		if(emp1.getNome().equals(emp2.getNome())) {
			System.out.println("Nomes iguais!");
		} else {
			System.out.println("Nomes diferentes!");
		}
	}

}
