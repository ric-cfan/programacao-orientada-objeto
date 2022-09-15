package br.edu.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraFile {

	public static void main(String[] args) {
		try {
			File arquivo = new File("/Users/ASUS/serratec/programacao-orientada-objeto/exemplos/leitura.txt");
			Scanner sc = new Scanner(arquivo);
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();	
		} catch (FileNotFoundException e) {
			System.out.println(" Erro! Caminho do arquivo inválido! ");
		}
	}

}
