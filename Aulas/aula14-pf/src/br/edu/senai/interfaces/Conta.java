package br.edu.senai.interfaces;

public interface Conta {
	public void transacao();
	
	//Metodo default - metodos que contem implementacao dentro da interface
	default void investimento() {
		System.out.println("Você aplicou em um investimento!");
	}
	
}