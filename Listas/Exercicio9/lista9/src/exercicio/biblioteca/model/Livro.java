package exercicio.biblioteca.model;

public class Livro {
	private String titulo, autor;
	private Double preco;

	public Livro(String titulo, String autor, Double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Titulo=" + titulo + ", Autor=" + autor + ", Preco=" + preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Double getPreco() {
		return preco;
	}

}
