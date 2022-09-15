package Questao3;

import java.util.List;

public class Time {
	private String nome, tecnico, diretor;
	private List<Atleta> atletas;

	public Time(String nome, String tecnico, String diretor, List<Atleta> atletas) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "Time: \n[" + nome + "] \n\nAtletas: \n" + atletas;
	}

	public String getNome() {
		return nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

}
