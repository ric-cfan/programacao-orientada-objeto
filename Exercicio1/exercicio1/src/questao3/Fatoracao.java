package questao3;

public class Fatoracao {

	public static void main(String[] args) {
		int i, fatorial = 1;
		
		for(i = 0; i <= 10; i++)
			if(i == 0) {
				System.out.println("O fatorial de 0 é: 1");
			} else {
				fatorial = fatorial*i;
				System.out.printf("O fatorial de %d é: %d\n", i, fatorial);
			}
		}
}
