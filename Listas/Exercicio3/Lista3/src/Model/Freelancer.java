package Model;

public class Freelancer extends Vendedor {
	private int diasTrabalhados;
	private double valorDia;

	public Freelancer(String nome, String cpf, int diasTrabalhados, double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}
	
	@Override
	public String toString() {
		return("Nome: " + super.toString() + "\nSalário bruto: R$" + (diasTrabalhados * valorDia));
	}

	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}
}
