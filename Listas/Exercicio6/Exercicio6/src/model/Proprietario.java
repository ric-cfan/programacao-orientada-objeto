package model;

public class Proprietario {

	private String nome;

	@Override
	public String toString() {
		return "Proprietario: " + nome;
	}

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}