package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		empregados.add(new Empregado("Lucas", "2222"));
		empregados.add(new Empregado("Roni", "0000"));
		empregados.add(new Empregado("Bacon", "9999"));
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}

}
