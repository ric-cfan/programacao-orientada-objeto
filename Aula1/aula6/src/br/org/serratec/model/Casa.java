package br.org.serratec.model;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	@Override
	public String toString() {
		return "Garagem: " + (garagem ? "Tem Garagem" : "Não tem Geragem") + " | Local: " + local + " | Valor: " + valor;
	}

	public Boolean getGaragem() {
		return garagem;
	}

}
