package aula2;

public class Exemplo2Repeticao {

	public static void main(String[] args) {
		String[] vetor = {"Ana", "Maria", "Carlos", "Carla"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + " - " + vetor[i]);
		}
		System.out.println("----------------");
		
		for (String nome : vetor) {
			System.out.println(nome);
		}
	}

}
