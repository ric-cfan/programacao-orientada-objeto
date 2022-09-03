package exercicio2.teste;

import exercicio2.model.Atleta;
import exercicio2.model.Pais;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("EUA");
		Pais pais2 = new Pais("Brasil");
		
		Atleta atleta1 = new Atleta("Anderson Silva", 98., pais2);
		Atleta atleta2 = new Atleta("Jon Jone", 59., pais1);
		Atleta atleta3 = new Atleta("Vitor Belfort", 110., pais2);
		
		System.out.printf("O atleta %s %s \nO atleta %s %s \nO atleta %s %s \nTotal de participantes: %d", atleta1.getNome(), atleta1.verificaSituacao(), atleta2.getNome(), atleta2.verificaSituacao(), atleta3.getNome(), atleta3.verificaSituacao(), Atleta.getTotalParticipantes());

	}

}
