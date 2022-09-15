package Model;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;

	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefones=" + Arrays.toString(telefones) + ", endereco=" + endereco + "]";
	}



	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefone() {
		return telefones;
	}
	
	public void mostrarTelefones() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println(telefones[i].getNumero());
		}
	}
		
	public void adicionarTelefone(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone;
				break;
			}
		}
	}

}
