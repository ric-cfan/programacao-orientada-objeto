package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.edu.senai.model.Conta;

public class ContaDao {
	private Connection connection;
	
	public ContaDao() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionarConta(Conta conta) {
		try {
			String sql = "insert into conta(numero_conta, titular_conta, saldo_conta) values(?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, conta.getNumeroConta());
			stmt.setString(1, conta.getTitularConta());
			stmt.setDouble(1, conta.getSaldoConta());
			stmt.execute();
			stmt.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o registro");
		}
	}
	
}
