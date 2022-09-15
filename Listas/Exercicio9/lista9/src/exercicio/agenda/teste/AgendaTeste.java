package exercicio.agenda.teste;

import exercicio.agenda.model.Agenda;

public class AgendaTeste {

	public static void main(String[] args) {
		Agenda.inserir("N", "11111");
		Agenda.inserir("O", "22222");
		Agenda.inserir("M", "33333");
		Agenda.inserir("E", "44444");
		Agenda.inserir("S", "55555");
		
		Agenda.buscarNumero("O");
		
		System.out.println("\nQuantidade de contatos na agenda: " + Agenda.tamanho());
		
		Agenda.remover("S");
		
		System.out.println("\nQuantidade de contatos na agenda após remoção: " + Agenda.tamanho());

	}

}
