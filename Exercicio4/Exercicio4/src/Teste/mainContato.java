package Teste;

import Model.Cidade;
import Model.Contato;
import Model.Endereco;
import Model.Estado;
import Model.Telefone;

public class mainContato {

	public static void main(String[] args) {
		
		Estado estado1 = new Estado("São Paulo", "SP");
		Cidade cidade1 = new Cidade("Parasópolis", estado1);
		Endereco endereco1 = new Endereco("Do Chão", "Cascatão", "22222", cidade1);
		Contato contato1 = new Contato("Jorginho", new Telefone[2], endereco1);
		Telefone telefone1 = new Telefone("555-4444");
		Telefone telefone2 = new Telefone("555-3333");
		
		contato1.adicionarTelefone(telefone1);
		contato1.adicionarTelefone(telefone2);
		
		
		System.out.println(contato1.toString());
	}

}
