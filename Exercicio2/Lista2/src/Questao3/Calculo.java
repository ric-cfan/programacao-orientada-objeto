package Questao3;

public class Calculo {
	private double numero1, numero2, resultado;

	public Calculo(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getResultado() {
		return resultado;
	}
	
	static double Soma(double numero1, double numero2) {
		double resultado = (numero1 + numero2);
		return resultado;
	}
	
	static double Subtracao(double numero1, double numero2) {
		double resultado = (numero1 - numero2);
		return resultado;
	}
	
	static double Multiplicacao(double numero1, double numero2) {
		double resultado = (numero1 * numero2);
		return resultado;
	}
	
	static double Divisao(double numero1, double numero2) {
		double resultado = (numero1 / numero2);
		return resultado;
	}
	
}
