package br.com.fiap.tds.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que cria as conexões com o banco de dados
 * @author Thiago Yamamoto
 */
public class ConnectionFactory {

	/**
	 * Método que retorna uma conexão com o banco de dados
	 * @return Connection conexão com o banco oracle
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexao = DriverManager.getConnection(
				"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392", "fiap");
		
		return conexao;
	}
	
}