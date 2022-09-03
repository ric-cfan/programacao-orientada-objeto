package questao5;

import java.util.Scanner;

public class Inteiro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número inteiro:");
		numero = ler.nextInt();
		
		System.out.printf("\nNúmero escolhido: %d \nSeu antecessor: %d \nSeu sucessor:%d", numero, (numero - 1), (numero + 1));

	}

}
