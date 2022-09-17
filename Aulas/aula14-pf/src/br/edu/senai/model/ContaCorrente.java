package br.edu.senai.model;

import br.edu.senai.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("Transação OK !");
		
	}
	
	@Override
	public void investimento() {
		System.out.println("Investimento ok !");
	}

}
