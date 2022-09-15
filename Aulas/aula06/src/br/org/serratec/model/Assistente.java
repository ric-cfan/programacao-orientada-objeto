package br.org.serratec.model;

public class Assistente extends Empregado {
	private Double adicional;

	public Assistente(String cpf, String nome, Double salario, Double adicional) {
		super(cpf, nome, salario);
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return super.toString() + "Adicional: " + String.format("%.2f", salario) + " ";
	}

	public Double getAdicional() {
		return adicional;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.1 + adicional;
	}

}
