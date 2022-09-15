package br.org.serratec.teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		try {
			System.out.println("Você digitou: " + lerDados());
		} catch (InputMismatchException e) {
			System.out.println("ERRO - Não pode letra");
		}
	}
	
	public static int lerDados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = sc.nextInt();
		sc.close();
		
		return num;
	}

}
