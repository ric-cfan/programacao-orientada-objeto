package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteCSV {

	public static void main(String[] args) throws IOException {
	
	    List <Maluco> malucos = new ArrayList <>();
	    String fileIn = "C:\\Users\\ASUS\\Serratec\\programacao-orientada-objeto\\Trabalho\\teste.csv";
	    String fileOut = "C:\\Users\\ASUS\\Serratec\\programacao-orientada-objeto\\Trabalho\\testeOut.csv";
	    String line = null;
	
	    FileReader fr = new FileReader(fileIn);
	    BufferedReader br = new BufferedReader(fr);
	
	    while ((line = br.readLine()) != null) {
	        String[] temp = line.split(",");
	        String nome = temp[0];
	        String cpf = temp[1];
	        double salario = Double.parseDouble(temp[2]);
	        malucos.add(new Maluco(nome, cpf, salario));
	        for (Maluco maluco : malucos) {
				maluco.calculaSalario();
			}
	    }
	    
	    FileWriter writer = new FileWriter(fileOut);
	    String collect = malucos.stream().collect(Collectors.joining(","));
	    System.out.println(collect);

	    writer.write(collect);
	    writer.close();
	}
}