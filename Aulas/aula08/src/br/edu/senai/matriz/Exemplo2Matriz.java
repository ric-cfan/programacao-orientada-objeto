package br.edu.senai.matriz;

public class Exemplo2Matriz {

	public static void main(String[] args) {	
		String pessoas[][] = {{"Marcos", "m@gmail.com"}, {"Maria", "maria@gmail.com"}, {"Carlos", "carlos@gmail.com"}, {"Adriano", "a@gmail.com"}};
		
		for(int linha = 0; linha < pessoas.length; linha++) {
			System.out.println("*****************");
			for(int coluna = 0; coluna < pessoas[linha].length; coluna++) {
				System.out.println(pessoas[linha][coluna]);
			}
		}
		
		
		
		/*int x = 5, o = 6;
		String[][] treino = new String[x][o];
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < o; j++) {
				if(i == j) {
					treino[i][j] = "X";
				} else {
					treino[i][j] = "O";
				}
				System.out.printf("%s", treino[i][j]);
			}
			System.out.printf("\n");
		}*/
		
	}

}
