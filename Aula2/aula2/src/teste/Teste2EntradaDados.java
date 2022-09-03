package teste;

import java.util.Scanner;

public class Teste2EntradaDados {

	public static void main(String[] args) {
		String nome, sobrenome; //%s
		int idade; //%d
		double altura; //%f
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		nome = sc.next();
		
		System.out.println("Digite o sobrenome:");
		sobrenome = sc.next();
		
		System.out.println("Digite a idade:");
		idade = sc.nextInt();
		
		System.out.println("Digite a altura:");
		altura = sc.nextDouble();
		
		System.out.printf("%s %s tem %d anos e %.2fm de altura", nome, sobrenome, idade, altura);
	}

}
