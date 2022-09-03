package questao4;

import javax.swing.JOptionPane;

public class Painel {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
		String email = JOptionPane.showInputDialog("Digite seu email:");
		String dinheiro = JOptionPane.showInputDialog("Digite seu salario:");
		Double salario = Double.parseDouble(dinheiro);
		
		JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\nSeu telefone é: " + telefone + "\nSeu e-mail é: " + email + "\nSeu salário com acréiscimo de 10% é: " + String.format("%.2f", (salario * 1.1)));

	}

}
