package br.edu.senau.exercicio;

import java.time.LocalDate;

public abstract class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;

	public Animal(String nome, LocalDate dataVacinacao) {
		super();
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}

	public abstract String emitirSom();
}
