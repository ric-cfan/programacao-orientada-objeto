package teste;

public class Maluco {
	private String nome, cpf;
	private double salarioIni, salarioFin;

	public Maluco(String nome, String cpf, double salarioIni) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salarioIni = salarioIni;
	}

	@Override
	public String toString() {
		return "Maluco [nome=" + nome + ", cpf=" + cpf + ", salarioIni=" + salarioIni + ", salarioFin=" + salarioFin
				+ "]";
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalarioIni() {
		return salarioIni;
	}

	public double getSalarioFin() {
		return salarioFin;
	}
	
	public void calculaSalario( ) {
		salarioFin = salarioIni + 200.;
	}

}
