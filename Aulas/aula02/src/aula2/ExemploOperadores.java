package aula2;

public class ExemploOperadores {

	public static void main(String[] args) {
		//Um atleta podera participar de uma maratona caso a idade seja superior ou altura maior a 1.8
		int idade = 19;
		double altura = 1.65;
		
		if (idade > 18 || altura >= 1.8) {
			System.out.println("Competirá");
		} else {
			System.out.println("Não competirá");
		}
		
		String resposta = idade > 18 || altura >= 1.8 ? "Competirá":"Não competirá";
		System.out.println(resposta);
	}

}
