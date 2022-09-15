package br.edu.senai.model;

public class Setor {
	private String descricao;
	private Integer numero;

	public Setor(String descricao, Integer numero) {
		super();
		this.descricao = descricao;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Setor [descricao=" + descricao + ", numero=" + numero + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getNumero() {
		return numero;
	}

}
