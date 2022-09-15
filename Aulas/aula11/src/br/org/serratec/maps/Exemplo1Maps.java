package br.org.serratec.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exemplo1Maps {

	public static void main(String[] args) {
		LinkedHashMap<String, String> estados = new LinkedHashMap<>();
		//TreeMap<String, String> estados = new TreeMap<>();
		//Map<String, String> estados = new HashMap<>();
		
		estados.put("AC", "ACRE");
		estados.put("RJ", "RIO DE JANEIRO");
		estados.put("MG", "MINAS GERAIS");
		estados.put("SP", "SÃO PAULO");
		estados.put("SE", "SERGIPE");
		
		System.out.println("------Retorn a chave do mapa----------");
		for (String string : estados.keySet()) {
			System.out.println(string);
		}
		
		System.out.println("------Retorna os valores do mapa--------");
		
		for (String estado : estados.values()) {
			System.out.println(estado);
		}
		
		System.out.println("------Retorna as chaves e valores do mapa--------");
		
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			//System.out.println(mapa.getKey() + " - " + mapa.getValue());
			System.out.println(mapa);
		}
		
	}

}
