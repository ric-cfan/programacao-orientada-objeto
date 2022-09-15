package br.org.serratec.model;

//Com abstract, a classe não pode ser instanciada
public abstract class Empregado {
	private String cpf, nome;
	protected Double salario;

	public Empregado(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado: CPF: " + cpf + " Nome: " + nome + " Salario: " + String.format("%.2f", salario) + " ";
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	//Abaixo esta uma assinatura de metodo abstrato, de forma que o metodo nao tem implmentacao, todos os filhos obrigatoriamente deverao ter esse metodo
	public abstract void aumentarSalario( );

}
