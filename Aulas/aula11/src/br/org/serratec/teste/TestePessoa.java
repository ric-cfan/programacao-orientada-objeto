package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Amaral", "a@gmail.com", 35);
		Pessoa p2 = new Pessoa("Zeila", "z@gmail.com", 85);
		Pessoa p3 = new Pessoa("Jurema", "j@gmail.com", 14);

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
	}

}
