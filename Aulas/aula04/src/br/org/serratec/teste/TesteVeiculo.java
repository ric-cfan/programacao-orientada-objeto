package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("123", "KYO-3333","Azul", 90000.0, 5000);
		c.calcularIPVA();
		System.out.println("Valor IPVA: " + c.getValorIPVA());
		System.out.println(c.toString());
	
	}

}
