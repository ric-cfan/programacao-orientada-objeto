package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

import br.edu.senai.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(new Aluno("Jorge", "j@gmail.com", 45),
				new Aluno("Maria", "m@gmail.com", 18));
		
		/*for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}*/
		
		//ExibirDadosAluno exibirDadosAluno = new ExibirDadosAluno();
		//alunos.forEach(exibirDadosAluno);
		
		/*Consumer<Aluno> exibirDadosAluno = new Consumer<Aluno>() {

			@Override
			public void accept(Aluno t) {
				System.out.println("-----Dados do Aluno-----");
				System.out.println(t.getNome());
				System.out.println(t.getEmail());
				System.out.println(t.getIdade());
			}
		
		};
		alunos.forEach(exibirDadosAluno);*/
		
		alunos.forEach(t -> {
			System.out.println("---For Each---");
			System.out.println(t.getNome());
			System.out.println(t.getEmail());
		});
	}

}
