package br.edu.senai.varargs;

public class ExemploVarArgs {

	public static void main(String[] args) {
		System.out.println(somarNumero(10, 20, 30, 40));
		
	}
	
	public static int somarNumero(int... numeros) {
		int soma = 0;
		for (int valor: numeros) {
			soma+= valor;
		}
		return soma;
	}

}
