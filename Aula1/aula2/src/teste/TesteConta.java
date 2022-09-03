package teste;

import model.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numeroConta = 1;
		conta1.saldo = 99.99;
		conta1.titular = "Titular1";
		
		Conta conta2 = new Conta();
		conta2.numeroConta = 2;
		conta2.saldo = 5000;
		conta2.titular = "Titular2";
		
		System.out.println("Saldo original conta 1: " + conta1.saldo);
		System.out.println("Saldo original conta 2: " + conta2.saldo);
		
		conta1.deposito(20);
		conta2.deposito(300);
		System.out.println("Saldo pós-deposito conta 1: " + conta1.saldo);
		System.out.println("Saldo pós-deposito conta 2: " + conta2.saldo);
		
		if (conta1.saque(30)){
			System.out.println("Saque conta 1 efetuado com sucesso !");
		} else {
			System.out.println("Não tem dinheiro suficiente na conta 1");
		}
		System.out.println("Saldo pós-saque conta 1: " + conta1.saldo);
		if (conta2.saque(1000)){
			System.out.println("Saque conta 2 efetuado com sucesso !");
		} else {
			System.out.println("Não tem dinheiro suficiente na conta 2");
		}
		System.out.println("Saldo pós-saque conta 2: " + conta2.saldo);
	}

}
