package br.org.serratec.model;

public class Assistente extends Funcionario {
	String categoria;

	public Assistente(String cpf, String nome, double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
