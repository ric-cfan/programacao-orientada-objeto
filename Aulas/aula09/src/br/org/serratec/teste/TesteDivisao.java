package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedia;

public class TesteDivisao {

	public static void main(String[] args) {
		int dividendo = 4;
		for(int i = 0; i <= dividendo; i++) {
			try {
				System.out.println(dividendo + "/" + i + " = " + CalculoMedia.calcular(dividendo, i));	
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("\nErro! Divisão por zero! Verifique seu código");
			} finally {
				//finally sempre executa, independente se cai no catch ou nao
				System.out.println("--------");
			}
		}
	}
}
