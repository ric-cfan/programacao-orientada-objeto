package br.org.serratec.model;

public class Veiculo {
	protected String chassi, placa, cor;
	protected Double valor, valorIPVA;

	public Veiculo(String chassi, String placa, String cor, Double valor) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return chassi + "\n" + placa + "\n" + cor + "\n" + valor;
	}
	
	public String getChassi() {
		return chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public Double getValor() {
		return valor;
	}

	public void calcularIPVA() {
		valorIPVA = (valor * 0.04);
	}

	public Double getValorIPVA() {
		return valorIPVA;
	}
}
