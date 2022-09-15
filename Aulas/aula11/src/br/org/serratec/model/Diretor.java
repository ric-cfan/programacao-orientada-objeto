package br.org.serratec.model;

public class Diretor extends Funcionario {
	private String categoria;

	public Diretor(String nome, String email, Double valor, String categoria) {
		super(nome, email, valor);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Diretor [categoria=" + categoria + ", toString()=" + super.toString() + "]";
	}

	public String getCategoria() {
		return categoria;
	}

}
