package br.edu.senai.model;

public class Luta {
	private Lutador desafiante, desafiado;
	private Boolean confirmacao = false;

	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmacao) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmacao = confirmacao;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public Boolean getConfirmacao() {
		return confirmacao;
	}
	
	public Boolean confirmacaoLuta() {
		//Para a luta ser confirmada e necessario checar se o desafiante e diferente do desafiado e tambem se as categorias sao iguais
		if(!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;
		} else {
			return false;
		}
	
	}

}
