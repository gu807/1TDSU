package br.com.fiap.tds.view;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploCadastro {

	public static void main(String[] args) {
		
		try {
			
			//Conectar no banco de dados
			Connection conexao = ConnectionFactory.getConnection();
			
			//Inserir um funcionário
			Statement stmt = conexao.createStatement();
			
			stmt.executeUpdate("INSERT INTO TB_FUNCIONARIO (CD_FUNCIONARIO, NM_FUNCIONARIO, "
					+ "ST_ATIVO, DT_NASCIMENTO, VL_SALARIO) VALUES (SQ_TB_FUNCIONARIO.NEXTVAL, "
					+ "'Allen', 1, '10/10/2000' , 20000)");
			
			System.out.println("Funcionário registrado!");
			
			//Fechar a conexão
			conexao.close();
			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver JDBC não encontrado!");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Não foi possível conectar!");
			e.printStackTrace();
		}
		
	}//main
	
}//classe