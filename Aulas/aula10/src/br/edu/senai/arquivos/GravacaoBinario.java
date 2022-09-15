package br.edu.senai.arquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinario {

	public static void main(String[] args) {
		try {
			FileOutputStream gravar = new FileOutputStream("/Users/ASUS/serratec/programacao-orientada-objeto/exemplos/teste.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(gravar);
			gravarArquivo.writeChars("Java Orientação a objetos !");
			gravarArquivo.close();
			
		} catch (Exception e){
			System.out.println("Erro na gravação de arquivo");
		}
		
	}

}
