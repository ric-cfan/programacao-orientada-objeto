package br.edu.senai.model;

import java.util.Objects;

public class Empregado {
	private String cpf, nome;

	public Empregado(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Empregado [cpf=" + cpf + ", nome=" + nome + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(cpf, other.cpf);
	}
}
