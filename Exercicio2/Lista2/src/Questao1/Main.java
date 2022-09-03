package Questao1;

import javax.swing.JOptionPane;
import Questao1.Funcionario;

public class Main {

	public static void main(String[] args) {
		String nome, salarioString;
		double salario, salarioLiquido;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		salarioString = JOptionPane.showInputDialog("Digite seu salário:");
		salario = Double.parseDouble(salarioString);

		Funcionario funcionario = new Funcionario(nome, salario);
		
		salarioLiquido = (funcionario.getSalario() - funcionario.calcularInss() - funcionario.calcularValeTransporte());
		JOptionPane.showConfirmDialog(null, "Nome: " + funcionario.getNome() + "\nSalário: R$" + String.format("%.2f", funcionario.getSalario()) + "\nINSS: R$" + String.format("%.2f", funcionario.calcularInss()) + "\nVale Transporte: R$" + String.format("%.2f", funcionario.calcularValeTransporte()) + "\nSalário Líquido: R$" + String.format("%.2f", salarioLiquido));
	}

}
