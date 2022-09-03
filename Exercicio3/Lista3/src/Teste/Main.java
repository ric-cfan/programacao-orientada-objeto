package Teste;

import java.util.Scanner;

import Model.Fixo;
import Model.Freelancer;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String decisao = "", resposta;
		double valorVenda, total = 0;
		
		Fixo vendedor1 = new Fixo("Joana", "1111", 2000., 0.075);
		Freelancer vendedor2 = new Freelancer("Maria", "2222", 30, 50.);
		
		while(!decisao.equals("S")) {
			while(!decisao.equals("1") && !decisao.equals("2")) {
				System.out.printf("--------Sistema de Vendas-------- \nVendedores: \n1 - %s \n2 - %s \nEscolha o vendedor:\n", vendedor1.getNome(), vendedor2.getNome());
				decisao = scan.next();
				resposta = (decisao.equals("1") || decisao.equals("2") ) ?  "":"Opção inválida, por favor digite uma das opções mostradas\n";
				System.out.println(resposta);
			}
			
			System.out.println("\nDigite o valor da venda:");
			valorVenda = scan.nextDouble();
			if (decisao.equals("1")) {
				vendedor1.calcularSalario(valorVenda);
			}
			total += valorVenda;
			
			while(!decisao.equals("S") && !decisao.equals("N")) {
				System.out.println("\nDeseja encerrar o programa? (S/N)");
				decisao = scan.next();
				decisao = decisao.toUpperCase();
				resposta = (decisao.equals("S") || decisao.equals("N") ) ?  "":"Opção inválida, por favor digite uma das opções mostradas\n";
				System.out.println(resposta);
			}
		}
			
		System.out.printf("-----Salário dos vendedores:----- \n%s \n%s \n----------Total vendido:--------- \nTotal: R$%.2f", vendedor1, vendedor2, total);
		scan.close();
	}
}
