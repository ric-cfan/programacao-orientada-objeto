package br.org.serratec.model;

public interface Conta {
	Double taxaBancaria = 2.5;

	Boolean saque(Double valor);
	Boolean deposito(Double valor);
	
}
