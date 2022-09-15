package br.edu.senai.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		//Set nao repete itens, hash bota em ordem aleatoria, Tree bota em ordem alfabetica
		//Set<String> cores = new HashSet<>();
		Set<String> cores = new TreeSet<>();

		
		cores.add("Azul");
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Laranja");
		cores.add("Branco");
		cores.add("Azul");
		
		System.out.println(cores);
	}

}
