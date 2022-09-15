package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Medico;

public class ExemploMedico {

	public static void main(String[] args) {
		Double maiorValor = 0.;
		String nome ="";
		List<Medico> medicos = new ArrayList<>();
		
		medicos.add(new Medico("123", "Sergio", 200.));
		medicos.add(new Medico("321", "Carla", 180.));
		medicos.add(new Medico("423", "Carlos", 290.));

		for (Medico medico : medicos) {
			if(medico.getValorConsulta() > maiorValor) {
				maiorValor = medico.getValorConsulta();
				nome = medico.getNome();
			}
			System.out.println(medico);
		}
		System.out.println("Valor mais caro é: " + maiorValor + ", do médico: " + nome);
	}

}
