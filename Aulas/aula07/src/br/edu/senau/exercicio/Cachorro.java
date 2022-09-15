package br.edu.senau.exercicio;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {

	private boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	@Override
	public Boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean alimentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aumentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
