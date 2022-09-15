package br.edu.senai.arquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploListagemArquivoDiretorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo ou nome do diretório:");
		String caminho = sc.next();
		
		File file = new File(caminho);
		
		if(file.exists()) {
			if (file.isFile()) {
			System.out.printf("\n Arquivo %s existe mesmo - tamanho %d bytes", file.getName(), file.length());
			} else {
				System.out.println("Conteudo do diretorio: " + file.length());
				String diretorio[] = file.list();
				for (String s: diretorio) {
					System.out.printf("%s\n", s);
				}
			}
		} else {
			System.out.println("Arquivo ou diretório não encontrado");
		}
		sc.close();
		
	}

}
