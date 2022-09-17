package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import br.edu.senai.model.Aluno;

public class Exemplo2Stream {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Mariana", "mari@hotmail.com", 55);
		Aluno aluno2 = new Aluno("Maria", "maria@hotmail.com", 15);
		Aluno aluno3 = new Aluno("Adriana", "a@gmail.com", 32);
		Aluno aluno4 = new Aluno("Oscar", "oscar@hotmail.com", 33);
		Aluno aluno5 = new Aluno("Sergio", "sergio@gmail.com", 81);
		
		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);
		
		//Filter e usado para filtro de dados e retorno de boolean
		alunos.stream().filter(a -> a.getIdade() > 50).forEach(t -> System.out.println(t));
		alunos.stream().filter(a -> a.getNome().startsWith("M")).forEach(t -> System.out.println(t));
		
	}

}
