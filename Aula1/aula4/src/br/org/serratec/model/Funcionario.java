package br.org.serratec.model;

public class Funcionario {
	private String cpf, nome;
	private static Double salario;

	public Funcionario(String cpf, String nome, double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	static Double AumentarSalario() {
		return(salario *= (salario * 1.1));
	}

}
