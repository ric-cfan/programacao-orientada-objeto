package questao1;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Produto p1 = new Produto(111, "Carro", 30000., Categoria.AUTOMOTIVO);
		Produto p2 = new Produto(222, "Doce", 3., Categoria.ALIMENTO);
		Produto p3 = new Produto(333, "Camisa", 30., Categoria.ROUPAS);

		Venda v1 = new Venda(p1, LocalDate.of(2022, 4, 5), 1);
		Venda v2 = new Venda(p2, LocalDate.of(2022, 7, 9), 5);
		Venda v3 = new Venda(p3, LocalDate.of(2022, 6, 24), 3);
		
		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();
		
		System.out.println("Total por Item: \n-----------------------------------------");
		v1.mostrarVenda();
		v2.mostrarVenda();
		v3.mostrarVenda();
		System.out.println("----------------------------------------- \nTotal Geral Venda: " + Venda.getTotalVenda());
	}

}
