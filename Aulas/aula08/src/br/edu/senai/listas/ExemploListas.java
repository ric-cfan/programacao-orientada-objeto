package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {
		List listaDeTimes = new ArrayList<>();
		
		listaDeTimes.add("Flamengo");
		listaDeTimes.add("Vasco");
		listaDeTimes.add("Serrano");
		listaDeTimes.add("Bangu");
		listaDeTimes.add(5000.);
		listaDeTimes.add(true);
		
		System.out.println("Tamanho da Lista: " + listaDeTimes.size());		
		listaDeTimes.remove(5);
		listaDeTimes.set(4, "Botafogo");
		
		System.out.println(listaDeTimes.get(0));
		System.out.println(listaDeTimes);
		
	}

}
