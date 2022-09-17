package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo3Stream {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10, 100, 200, 400, 900, 900, 900, 1200, 40);
		
		//Imprimir a lista com incremento de 10 para todos os valores
		/*numeros.stream().map(t -> t + 10).forEach(t -> System.out.println(t));
		numeros.forEach(t -> System.out.println(t));
		
		System.out.println("------------------------------------------");
		List<String> numeros2 = Arrays.asList("30", "500", "100", "100", "200", "80");
		numeros2.stream().map(n -> new Double(n)).forEach(n -> System.out.println(n));
		
		System.out.println(numeros2.stream().map(n -> new Double(n)).count());*/
		
		//numeros.stream().skip(2).forEach(t -> System.out.println(t));
		//numeros.stream().limit(3).forEach(t -> System.out.println(t));
		
		//numeros.stream().distinct().forEach(n -> System.out.println(n));
		numeros.stream().sorted().distinct().forEach(n -> System.out.println(n));
		
	}

}
