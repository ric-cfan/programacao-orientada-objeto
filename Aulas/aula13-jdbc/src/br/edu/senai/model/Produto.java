package br.edu.senai.model;

public class Produto {
	private Integer codigo, quantidadeEstoque;
	private String descricao;
	private Double preco;
	private Categoria categoria;

	public Produto(Integer codigo, Integer quantidadeEstoque, String descricao, Double preco, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.quantidadeEstoque = quantidadeEstoque;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", quantidadeEstoque=" + quantidadeEstoque + ", descricao=" + descricao
				+ ", preco=" + preco + ", categoria=" + categoria + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
