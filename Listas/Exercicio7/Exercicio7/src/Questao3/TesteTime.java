package Questao3;

import java.util.ArrayList;
import java.util.List;

public class TesteTime {

	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<>();
		
		atletas.add(new Atleta("Joga", "Pos", 33));
		atletas.add(new Atleta("Dor", "Ição", 66));
	
		Time time1 = new Time("Timtim", "Tectec", "Dirdir", atletas);
		
		System.out.println(time1);
	}

}
