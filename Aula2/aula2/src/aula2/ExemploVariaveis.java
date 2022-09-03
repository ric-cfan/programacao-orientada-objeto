package aula2;

public class ExemploVariaveis {

	public static void main(String[] args) {
		String nome = "Ana";
		int idade = 20;
		float altura = 1.85f;
		double peso = 89.90;
		System.out.println("Dados:\nNome: " + nome.toUpperCase() + "\nIdade: " + idade + " Anos\nAltura: " + altura + "m\nPeso: " + peso + "Kg\n");
		double a = 10.5;
		int b = (int)a;
		System.out.println(b);
	}

}
