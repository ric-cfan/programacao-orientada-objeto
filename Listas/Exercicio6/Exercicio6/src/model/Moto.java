package model;

import java.time.LocalDate;

public class Moto extends Veiculo {
	public int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

}
