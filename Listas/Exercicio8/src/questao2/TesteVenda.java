package questao2;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Produto p1 = new Produto(111, "Bola quadrada", 22.99, Categoria.ELETRONICO);
		Produto p2 = new Produto(222, "Carrinho", 3., Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(333, "Doce", 100., Categoria.ALIMENTO);

		Venda v1 = new Venda(p1, LocalDate.of(2022, 9, 11), 2);
		Venda v2 = new Venda(p2, LocalDate.of(2022, 9, 4), 4);
		Venda v3 = new Venda(p3, LocalDate.of(2022, 5, 4), 1);

		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();

		System.out.println("Total por item: \n------------------------------------------\n" + v1 + "\n" + v2 + "\n" + v3 + "\n------------------------------------------ \nTotal Geral Venda: " + Venda.getTotalVenda());

	}

}
