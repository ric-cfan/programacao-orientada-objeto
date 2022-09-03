package exercicio1.teste;

import exercicio1.model.Livro;
import exercicio1.model.Operacao;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Marco Antônio", "Cisco CCNA", 85.);
		Livro livro2 = new Livro("Kathey Sierra", "Use a Cabeça Java", 98.);	
		Operacao opera1 = new Operacao("Venda", livro1);
		Operacao opera2 = new Operacao("Empréstimo", livro2);
		
		livro1.reajuste(6);
		opera1.venderLivro();
		opera2.emprestarLivro();
	
		System.out.println(opera1.toString() + "\n" + opera2.toString());
	}

}
