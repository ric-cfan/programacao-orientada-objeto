package Model;

public class Fixo extends Vendedor {
	private double salarioBase, comissao, salarioBruto;
	
	public Fixo(String nome, String cpf, double salarioBase, double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = this.salarioBase;
	}
	
	@Override
	public String toString() {
		return("Nome: " + super.toString() + "\nSalário bruto: R$" + salarioBruto);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public void calcularSalario(double valorVenda) {
		salarioBruto += valorVenda * comissao;
	}
}
