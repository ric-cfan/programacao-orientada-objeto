package Questao3;

import java.util.Scanner;

public class MainCalculadora {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		int resposta = 0;
		double numero1 = 0., numero2 = 0., resultado = 0.;
		
		while(resposta != 5) {
			System.out.println("Bem vindo a calculadora! Escolha uma das opções abaixo: \n\n1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão \n5. Sair\n");
			resposta = ler.nextInt();
			
			if(resposta != 5) {
				System.out.println("Digite o primeiro número da operação:");
				numero1 = ler.nextDouble();
				System.out.println("Digite o segundo número da operação:");
				numero2 = ler.nextDouble();
			}
			
			Calculo calculo = new Calculo(numero1, numero2);
			switch(resposta) {
				case 1:
					resultado = calculo.Soma(numero1, numero2);
					System.out.printf("%.2f + %.2f = %.2f\n\n", numero1, numero2, resultado);
				break;
				case 2:
					resultado = calculo.Subtracao(numero1, numero2);
					System.out.printf("%.2f - %.2f = %.2f\n\n", numero1, numero2, resultado);
				break;
				case 3:
					resultado = calculo.Multiplicacao(numero1, numero2);
					System.out.printf("%.2f x %.2f = %.2f\n\n", numero1, numero2, resultado);
				break;
				case 4:
					resultado = calculo.Divisao(numero1, numero2);
					System.out.printf("%.2f / %.2f = %.2f\n\n", numero1, numero2, resultado);
				break;
				case 5:
					System.out.println("Terminando programa, volte sempre!");
				break;
				default:
					System.out.println("Input inválido, por favor tente novamente\n\n");
				break;
			}
		}
		
	}

}
