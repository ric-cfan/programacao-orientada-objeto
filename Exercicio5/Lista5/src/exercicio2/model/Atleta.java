package exercicio2.model;

public class Atleta implements Olimpiadas {
	private String nome, modalidade;
	private double peso;
	static int totalParticipantes = 0;
	private Pais pais;

	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	@Override
	public String verificaSituacao() {
		if (peso > 60) {
			modalidade = peso < 90 ? "Peso médio" : "Peso pesado";
			totalParticipantes++;
			return "participará";
		} else {
			return "não participará";
		}
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Pais getPais() {
		return pais;
	}

}
