package br.org.serratec.model;

public class Gerente extends Funcionario {
	private String tipo;

	public Gerente(String cpf, String nome, double salario, String tipo) {
		super(cpf, nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
