package br.org.serratec.teste;

import br.org.serratec.model.AtletaAmador;
import br.org.serratec.model.AtletaProfissional;

public class TesteMaratonista {

	public static void main(String[] args) {
		AtletaAmador atleAma = new AtletaAmador("Leandro", "Masculino", 27, 1.8, true);
		
		if(atleAma.PodeCompetir()) {
		 System.out.println(atleAma + "\nPode competir");
		} else {
			System.out.println(atleAma + "\nNão pode competir");
		}
		
		AtletaProfissional atlePro = new AtletaProfissional("Prof", "Masculino", 30, 1.9, 98.);
		System.out.println(atlePro);
	}

}
