package exercicio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String responsavel = "Jô";
	private static List<Livro> ListaLivros = new ArrayList<>();

	public String getResponsavel() {
		return responsavel;
	}

	public List<Livro> getListaLivros() {
		return ListaLivros;
	}

	public static void adicionarLivro(Livro livro) {
		ListaLivros.add(livro);
	}

	public static void listar() {
		System.out.println("Lista de livros da biblioteca:");
		for (Livro livro : ListaLivros) {
			System.out.println(livro);
		}
		System.out.println("");
	}

	public static int pesquisarFaixaDePreco(Double valorInicial, Double valorFinal) {
		int i = 0;
		System.out.println("Livros na faixa de preço entre " + valorInicial + " e " + valorFinal + ":");
		for (Livro livro : ListaLivros) {
			if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				System.out.println(livro);
				i++;
			}
		}
		return i;
	}

	public static Double calcularTotalLivros() {
			Double TotalLivros = 0.;
			for (Livro livro : ListaLivros) {
				TotalLivros += livro.getPreco();
			}
		return TotalLivros;
	}

}
