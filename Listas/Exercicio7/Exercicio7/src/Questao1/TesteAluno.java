package Questao1;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno("Cleiver", 8.5, 8.7));
		alunos.add(new Aluno("Lucas", 8.7, 8.7));
		alunos.add(new Aluno("Ricardo", 8.7, 9.));
		alunos.add(new Aluno("Debo", 4., 10.));
		alunos.add(new Aluno("Thamires", 5., 2.5));

		for (Aluno aluno : alunos) {
			System.out.println(aluno + " Média: " + aluno.calcularMedia()
					+ "\n-----------------------------------------------------");
		}

	}

}
