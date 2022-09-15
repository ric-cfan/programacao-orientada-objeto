package br.edu.senai.model;

//Com final, essa classe nao poderia ter filhos, chamada imutavel
//public final class Policial {
public class Policial {
	private String nome, matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome = nome;
		this.matricula = matricula = matricula;
	}

	@Override
	public String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
