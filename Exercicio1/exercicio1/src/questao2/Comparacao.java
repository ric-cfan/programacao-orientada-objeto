package questao2;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		int i, alturaMax = 0, pesoMax = 0;
		double mediaAltura = 0., mediaPeso = 0., peso[] = {0,0,0,0}, altura[] = {0,0,0,0};
		String nome[] = {"","","",""};
		Scanner ler = new Scanner(System.in);
		
		for (i = 0; i < 4; i++) {
			System.out.println("Digite o nome:");
			nome[i] = ler.next();
			
			System.out.println("Digite o peso:");
			peso[i] = ler.nextDouble();
			
			System.out.println("Digite a altura:");
			altura[i] = ler.nextDouble();
			
			mediaAltura +=  altura[i];
			mediaPeso += peso[i];
			
			if(i == 0 || peso[pesoMax] < peso[i]) {
				pesoMax = i;
			}
			if(i == 0 || altura[alturaMax] < altura[i]) {
				alturaMax = i;
			}
			
		}
		
		mediaAltura = mediaAltura/i;
		mediaPeso = mediaPeso/i;
		
		System.out.printf("\n%s tem o maior peso. \n%s tem a maior altura. \nA média dos pesos é %.2f \nA média das alturas é %.2f", nome[pesoMax], nome[alturaMax], mediaPeso, mediaAltura);
	}
		
}
