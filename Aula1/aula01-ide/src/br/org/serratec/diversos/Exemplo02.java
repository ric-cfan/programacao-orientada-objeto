package br.org.serratec.diversos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo02 {

	public static void main(String[] args) {
		// ALT+SHIFT+R - ALTERAR NOME DE VARIAVEIS E METODOS
		//CTRL+SHIFT+F - IDENTACAO DO PROGRAMA
		int preco = 100;
		preco = 300;
		//CTRL+SHIT+O = IMPORTACAO DE PACOTES
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia: " + data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
