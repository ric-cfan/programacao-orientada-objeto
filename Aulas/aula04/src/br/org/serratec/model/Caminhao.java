package br.org.serratec.model;

public class Caminhao extends Veiculo {
	private int cargaMaxima;

	public Caminhao(String chassi, String placa, String cor, Double valor, int cargaMaxima) {
		super(chassi, placa, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}
	
	@Override
	public void calcularIPVA() {
		valorIPVA = (valor * 0.08);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + cargaMaxima;
	}
}
