package teste;

import java.time.LocalDate;

import model.Carro;
import model.Proprietario;

public class Teste {

	public static void main(String[] args) {
		Proprietario prop = new Proprietario("Cleiver");
		Carro carro = new Carro("Novo", LocalDate.of(2022, 8, 13), prop, "Categ"); //Formato -> Ano : Mes: Dia, 13/08 cai num sabado
		
		System.out.printf("Preço da troca de óleo: %.2f \nPreço da troca da revisão: %.2f \n\n%s", carro.trocarOleo(), carro.revisao(), carro);
	}

}