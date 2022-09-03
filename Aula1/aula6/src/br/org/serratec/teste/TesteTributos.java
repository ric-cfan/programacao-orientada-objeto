package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalizaTributos;

public class TesteTributos {

	public static void main(String[] args) {
		Empresa e = new Empresa("ABC", 259000.);
		Pessoa p = new Pessoa("Marcos", 82000.);
		TotalizaTributos t = new TotalizaTributos();
		
		t.totalGeralTributos(e);
		t.totalGeralTributos(p);
		
		System.out.println(e + "Tributos a pagar: ICMS: " + e.calcularICMS() + " IR: " + e.calcularImpostoDeRenda());
		System.out.println(p + "Tributos a pagar: IR: " + p.calcularImpostoDeRenda());
		System.out.println("Totalização dos tributos: " + t.getTotal());
	}
}
