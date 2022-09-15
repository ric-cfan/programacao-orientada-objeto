package br.edu.senai.vetor;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		String[] vetor = new String[3];
		
		String[] teste = new String[] {null, null, null};
		
		String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun"};
		
		int numero = 10;
		
		int[] testin = new int[numero];
		for(int i = 0; i < testin.length; i++) {
			testin[i] = i;
			System.out.println(testin[i]);
		}
		
		for (String mes : meses) {
			System.out.println(mes);
		}
	}

}
