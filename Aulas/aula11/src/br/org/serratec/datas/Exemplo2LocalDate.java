package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo2LocalDate {

	public static void main(String[] args) {
		LocalDate dataNascimento = LocalDate.of(2000, 9, 13);
		LocalDate dataAtual = LocalDate.now();
				
		Period period = Period.between(dataNascimento, dataAtual);
		System.out.println("Sua idade é: " + period.getYears() + " anos");
		System.out.println(period.getMonths() + " meses");
		System.out.println(period.getDays() + " dias");
		
	}

}
