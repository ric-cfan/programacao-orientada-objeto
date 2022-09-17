package br.edu.senai.exemplos;

import java.util.Optional;

import br.edu.senai.model.Carro;
import br.edu.senai.model.Seguro;

public class TesteCarro {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total", 3000.);
		Carro carro1 = new Carro("VW", "GOL", Optional.of(seguro));
		Carro carro2 = new Carro("FIAT", "PALIO", Optional.ofNullable(null));
		
		System.out.println(carro1);
		
		if(carro2.getSeguro().isPresent()) {
			System.out.println(carro2);
		}
	}

}
