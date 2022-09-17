package br.edu.senai.model;

public class Aluno implements Comparable<Aluno>{
	private String nome, email;
	private int idade;

	public Aluno(String nome, String email, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Aluno o) {
		return o.getIdade() - idade;
	}

}
