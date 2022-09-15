package br.edu.senai.model;

public class Empregado {
	private String nome, telefone;

	public Empregado(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", telefone=" + telefone + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

}
