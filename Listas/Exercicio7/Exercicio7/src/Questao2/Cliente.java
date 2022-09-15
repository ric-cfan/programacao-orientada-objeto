package Questao2;

public class Cliente {
	private String nome, telefone;
	private Integer id, idade;

	public Cliente(String nome, String telefone, Integer id, Integer idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.id = id;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", id=" + id + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public Integer getId() {
		return id;
	}

	public Integer getIdade() {
		return idade;
	}

}
