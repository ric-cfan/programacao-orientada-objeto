package br.edu.senai.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.senai.conexao.ConnectionFactory;
import br.edu.senai.model.Cliente;
import br.edu.senai.persistece.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(4, "Roberta da Silva", "232323", "robertas@gmail.com");
		Cliente cliente2 = new Cliente(5, "Mariana", "254344", "mariana@gmail.com");

		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao clienteDao = new ClienteDao(connection);
		
		try {
			connection.setAutoCommit(false);
			clienteDao.inserirCliente(cliente1);
			clienteDao.inserirCliente(cliente2);
			connection.rollback();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//clienteDao.inserirCliente(cliente);
		//clienteDao.atualizarCliente(cliente);
		//clienteDao.removerCliente(cliente);
		//System.out.println(clienteDao.listarClientes());
		/*for (Cliente c : clienteDao.listarClientes("dri")) {
			System.out.println(c);
		}
		*/
		
	}

}
