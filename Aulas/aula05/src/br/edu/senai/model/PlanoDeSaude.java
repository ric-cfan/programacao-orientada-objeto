package br.edu.senai.model;

public class PlanoDeSaude {
	protected String empresa;
	protected Double valorPago = 80., valorISS = 5.;

	public PlanoDeSaude(String empresa) {
		super();
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public Double getValorISS() {
		return valorISS;
	}

	public Double calcularPagamento() {
		return valorPago += (- valorPago * valorISS/100);
	}
}
