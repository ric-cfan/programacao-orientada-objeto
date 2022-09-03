package Questao2;

import java.util.Scanner;
import Questao2.Produto;

public class Main {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {		
		InstanciarProduto();			

	}
	
	static void FecharPrograma() {
		System.out.println("\nDeseja encerrar o programa? (S/N)");
		
		String resposta = ler.next();
		resposta = resposta.toUpperCase();
		
		if(resposta.equals("N")) {
			InstanciarProduto();
		} else if(resposta.equals("S")) {
			System.out.println("Volte sempre!");
		} else {
			System.out.println("Por favor digite uma opção válida");
			FecharPrograma();
		}
	}
	
	static void InstanciarProduto() {
		System.out.println("Produto:");
		String nome = ler.next();
		System.out.println("Valor:");
		Double valor = ler.nextDouble();
		System.out.println("Quantidade:");
		int quantidade = ler.nextInt();
		
		Produto produto = new Produto(nome, valor, quantidade);
		
		System.out.printf("Descrição: %s \nValor: %.2f \nTotal: %.2f \nICMS: %.2f", produto.getDescricao(), produto.getValor(), (produto.getQuantidade() * produto.getValor()), produto.calcularIcms());
	
		FecharPrograma();
	}

}
