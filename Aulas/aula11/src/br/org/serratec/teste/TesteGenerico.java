package br.org.serratec.teste;

import br.org.serratec.generico.MeuGenerico;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Funcionario;

public class TesteGenerico {

	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico("Hello !");
		MeuGenerico<Integer> mg2 = new MeuGenerico(1000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico(new Funcionario("José", "j@gmail.com", 2600.));
		
		System.out.println(mg1);
		System.out.println(mg2);
		System.out.println(mg3);
		
		MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(new Diretor("Marcos", "m@gmail.com", 9000., "CEO"));
	
		System.out.println(mg4);
	}

}
