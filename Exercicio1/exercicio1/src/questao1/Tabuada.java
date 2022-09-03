package questao1;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int resultado, i, numeroLido;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		numeroLido = ler.nextInt();
		
		System.out.println("\n+--Resultado--+\n");
		
		for (i = 1; i < 10; i++) {
			resultado = (numeroLido * i);
			
			if (resultado >= 10) {
				System.out.printf("|  %d * %d = %d |\n", i, numeroLido, resultado);

			}
			else {
				System.out.printf("|  %d * %d = %d  |\n", i, numeroLido, resultado);
			}
		}
		System.out.println("+-------------+");
		
		ler.close();
	}

}
