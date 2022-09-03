package br.org.serratec.model;

public class VeiculoPasseio extends Veiculo {
	private Integer quantidadePortas;

	public VeiculoPasseio(String chassi, String placa, String cor, Double valor, int quantidadePortas) {
		super(chassi, placa, cor, valor);
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}
}
