package model;

public class Conta {
	
	public int numeroConta;
	public String titular;
	public double saldo;
	
	//Sem retorno
	public void deposito(double valor) {
		saldo += valor;
	}
	
	//Com retorno
	public boolean saque(double valor) {
		if(saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
}
