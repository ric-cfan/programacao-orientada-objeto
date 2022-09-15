package br.org.serratec.model;

public class AtletaAmador extends Maratona {
	private Boolean atestado;

	@Override
	public String toString() {
		return super.toString() + "\nAtestado: " + (atestado ? "Sim" : "Não");
	}
	
	public AtletaAmador(String nome, String sexo, Integer idade, Double altura, Boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	public Boolean getAtestado() {
		return atestado;
	}
}
