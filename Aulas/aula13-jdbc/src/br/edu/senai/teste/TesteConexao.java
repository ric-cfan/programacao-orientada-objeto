package br.edu.senai.teste;

import java.sql.Connection;

import br.edu.senai.conexao.ConnectionFactorySingleton;

public class TesteConexao {

	public static void main(String[] args) {
		Connection con = ConnectionFactorySingleton.getConnection();
		
		
	}

}
