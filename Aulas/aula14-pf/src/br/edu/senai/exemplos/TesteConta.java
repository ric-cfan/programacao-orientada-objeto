package br.edu.senai.exemplos;

import br.edu.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta() {
			@Override
			public void transacao() {
				System.out.println("Transação efetuada !");
			}
			
		};
		conta.transacao();
		
		//Programacao funcionaro - apartir do Java8
		Conta conta2 = ()-> System.out.println("Transação efetuada, conta2");		
		conta2.transacao();
	}

}
