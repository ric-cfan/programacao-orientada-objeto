package br.org.serratec.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {

	public static void main(String[] args) {
		int vetor[] = {100, 200, 300};
		int a = 10, b = 0;
		
		/*try {
			FileReader fr = new FileReader("/Users/ASUS/Serratec/sts-4.15.3.RELEASE/license.txt");
			System.out.println("Arquivo Encontrado!");
			System.out.println(a/b);
			System.out.println(vetor[10]);
		} catch (FileNotFoundException exception){
			System.out.println("Arquivo não encontrado");
			//e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Dividiu por 0");
			//e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor fora da faixa de valor");
		}*/
		
		try {
			FileReader fr = new FileReader("/Users/ASUS/Serratec/sts-4.15.3.RELEASE/license.txt");
			System.out.println("Arquivo Encontrado!");
			System.out.println(a/b);
			System.out.println(vetor[10]);
		} catch (FileNotFoundException | ArithmeticException e){
			if (e.getStackTrace().equals("ArithmeticException")) {
				System.out.println("Erro Ari");
			} else {
				System.out.println("Outro erro");
			}
		}
	}
}
