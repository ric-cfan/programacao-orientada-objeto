package exercicio.agenda.model;

import java.util.Map;
import java.util.TreeMap;

public class Agenda {
	public static Map<String, String> colecao = new TreeMap<>();
	
	public static void inserir(String nome, String numero) {
		colecao.put(nome, numero);
	}
	
	public static void buscarNumero(String nome) {
		System.out.println("Usuário(s) e telefone(s) encontrado(s) para o nome: " + nome);
		for (Map.Entry<String, String> contato : colecao.entrySet()) {
			if(contato.getKey().equals(nome)) {
				System.out.println(contato);
			}	
		}
	}

	public static void remover(String nome) {
		colecao.remove(nome);
	}

	public static int tamanho() {
		return colecao.size();
	}
	
}
