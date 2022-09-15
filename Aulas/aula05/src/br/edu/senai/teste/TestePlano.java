package br.edu.senai.teste;

import br.edu.senai.control.ControlePagamento;
import br.edu.senai.model.Anestesista;
import br.edu.senai.model.Clinica;
import br.edu.senai.model.Medico;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", "Checkup", "22222222");
		Medico medico = new Medico("Golden Cross", 1233, "Antônio Carlos");
		Anestesista anestesista = new Anestesista("Amil", 134, "Silvana", "Geral");
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		cp.calcularTotalPago(clinica);
		
		medico.calcularPagamento();
		cp.calcularTotalPago(medico);
		
		anestesista.calcularPagamento();
		cp.calcularTotalPago(anestesista);
		
		System.out.println(clinica + " Valor a Receber do Plano: " + clinica.getValorPago());
		System.out.println(medico + " Valor a Receber do Plano: " + medico.getValorPago());
		System.out.println(anestesista + " Valor a Receber do Plano: " + anestesista.getValorPago());
		
		System.out.println("Total geral pago pelos planos: " + cp.getTotalGeral());
	}

}
