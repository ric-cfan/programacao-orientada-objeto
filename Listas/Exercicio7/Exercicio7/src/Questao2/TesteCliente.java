package Questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {	
		String nome, telefone;
		Integer id, idade;
		
		Scanner sc = new Scanner(System.in);
			
		List<Cliente> clientes = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite o id: ");
			id = sc.nextInt();
			if(id < 0) {
				break;
			}
			System.out.println("Digite o nome: ");
			nome = sc.next();
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			System.out.println("Digite o telefone: ");
			telefone = sc.next();
			clientes.add(new Cliente (nome, telefone, id, idade));
		}
		for (Cliente cliente : clientes) {
			System.out.println(cliente + "\n---------------------------------------------------");
		}
	}
}
