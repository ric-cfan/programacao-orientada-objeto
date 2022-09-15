package teste;

import model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("------------");
		//Instância de um objeto
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "Carlos";
		aluno1.email = "carlos@gmail.com";
		
		System.out.println(aluno1.matricula + " " + aluno1.nome);
		
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = aluno2;
		
		System.out.println("Aluno 3: " + aluno3);
		System.out.println("Aluno 2: " + aluno2);
		if (aluno3 == aluno2) {
			System.out.println("Objetos iguais !");
		} else {
			System.out.println("Objetos diferentes !");
		}
	}

}
