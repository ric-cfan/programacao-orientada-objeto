package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import enums.TipoServico;

public class Carro extends Veiculo {
	public String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return proprietario + ", Modelo: " + modelo + ", Data do conserto: "
				+ dataConserto + ", Categoria: " + categoria + ", Custo total: " + String.format("%.2f", valorCobrado);
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double trocarOleo() {
		DayOfWeek dia = DayOfWeek.from(dataConserto);
		if (dia == DayOfWeek.SATURDAY) {
			valorCobrado += TipoServico.OLEO.getValorPorServico() - 50;
			return TipoServico.OLEO.getValorPorServico() - 50;
		} else {
			valorCobrado += TipoServico.OLEO.getValorPorServico();
			return TipoServico.OLEO.getValorPorServico();
		}
	}
	
	@Override
	public Double revisao() {
		Month mes = dataConserto.getMonth();
		if(mes == Month.AUGUST) {
			valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.9;
			return TipoServico.REVISAO.getValorPorServico() * 0.9;
		} else {
			valorCobrado += TipoServico.REVISAO.getValorPorServico();
			return TipoServico.REVISAO.getValorPorServico();
		}
	}

}