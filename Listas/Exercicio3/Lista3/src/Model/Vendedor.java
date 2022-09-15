package Model;

public class Vendedor {
	protected String nome, cpf;

	public Vendedor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
