package model;

import java.time.LocalDate;

import enums.TipoServico;

public abstract class Veiculo implements Oficina {

	protected String modelo;
	protected Double valorCobrado = 0.;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public Double trocarOleo() {
		valorCobrado += TipoServico.OLEO.getValorPorServico();
		return TipoServico.OLEO.getValorPorServico();
	}
	
	@Override
	public Double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double revisao() {
		valorCobrado += TipoServico.REVISAO.getValorPorServico();
		return TipoServico.REVISAO.getValorPorServico();
	}

}