package questao2;

public class Produto {

	private int codigo;
	private String descricao;
	double valor;
	Categoria categoria;

	public Produto(int codigo, String descricao, double valor, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", categoria="
				+ categoria + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
