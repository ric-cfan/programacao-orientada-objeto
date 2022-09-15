package exercicio.biblioteca.teste;

import exercicio.biblioteca.model.Biblioteca;
import exercicio.biblioteca.model.Livro;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Ti", "A", 10.);
		Livro livro2 = new Livro("Tu", "U", 20.);
		Livro livro3 = new Livro("Lo", "Tor", 30.);

		Biblioteca.adicionarLivro(livro1);
		Biblioteca.adicionarLivro(livro2);
		Biblioteca.adicionarLivro(livro3);
		
		Biblioteca.listar();

		System.out.println("Total de livros na faixa de preço: " + Biblioteca.pesquisarFaixaDePreco(15., 20.));

		System.out.println("\nO valor total de todos os livros da biblioteca é: " + Biblioteca.calcularTotalLivros());

	}

}
