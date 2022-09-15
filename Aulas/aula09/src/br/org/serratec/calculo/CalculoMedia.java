package br.org.serratec.calculo;

public class CalculoMedia {
	//throws joga para a funcao que chama o metodo tratar por meio de try catch, ao inves de tratar no proprio metodo
	public static int calcular(int num1, int num2) throws ArithmeticException {
		return num1/num2;
	}
	
	/*public static int calcular(int num1, int num2) {
		if(num2 == 0) {
			//throw - lanca uma exception no metodo
			throw new ArithmeticException("Você digitou 0 no segundo parâmetro !");
		} else {
			return num1/num2;
		}
	}*/
	
}
