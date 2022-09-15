package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Proprietario;

public class TesteImovel {

	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario("João");
		Proprietario dono2 = new Proprietario("Maria");
		Casa casa = new Casa("Barra", 300000., true);
		Apartamento ap = new Apartamento("Centro", 500000., 3);
		
		casa.setProprietario(dono1);
		ap.setProprietario(dono2);
		
		System.out.println("Casa | " + casa + " | ITBI: " + casa.calcularITBI() + " | "+ casa.getProprietario() + "\nApartamento | " + ap +  " | ITBI: " + ap.calcularITBI() + " | " + ap.getProprietario());
	}

}
