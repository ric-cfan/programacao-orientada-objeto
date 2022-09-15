package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
		Empregado empregados[] = new Empregado[3];
		
		empregados[0] = new Empregado("Lucas", "2222");
		empregados[1] = new Empregado("Roni", "0000");
		empregados[2] = new Empregado("Bacon", "9999");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}

}
