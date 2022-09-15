package br.edu.senai.model;

public class Conta {
	private Integer numeroConta;
	private String titularConta;
	private Double saldoConta;

	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", titularConta=" + titularConta + ", saldoConta=" + saldoConta
				+ "]";
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

}
