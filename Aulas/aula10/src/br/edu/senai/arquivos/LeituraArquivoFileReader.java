package br.edu.senai.arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraArquivoFileReader {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("/Users/ASUS/serratec/programacao-orientada-objeto/exemplos/leitura.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado !");
		}
		
	}

}
