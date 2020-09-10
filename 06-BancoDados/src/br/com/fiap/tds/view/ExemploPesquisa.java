package br.com.fiap.tds.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploPesquisa {

	//Pesquisar todos os funcionários
	public static void main(String[] args) {
		
		try {
		
			//Abrir a conexão
			Connection conexao = ConnectionFactory.getConnection();
			
			//Criar o statement 
			Statement stmt = conexao.createStatement();
						
			//Executar a pesquisa
			ResultSet resultados = stmt.executeQuery("SELECT * FROM TB_FUNCIONARIO");
			
			//Percorre todos os registros encontrados
			while (resultados.next()){
				//Recuperar os dados das colunas
				int codigo = resultados.getInt("CD_FUNCIONARIO");
				String nome = resultados.getString("NM_FUNCIONARIO");
				boolean ativo = resultados.getBoolean("ST_ATIVO");
				double salario = resultados.getDouble("VL_SALARIO");
				String data = resultados.getString("DT_NASCIMENTO");
				
				System.out.println(codigo + " " + nome + " " + ativo + " " + salario + " " + data);
			}
			
			//Fechar
			stmt.close();
			conexao.close();
			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver não encontrado!");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Erro ao abrir o banco ou executar a pesquisa");
			e.printStackTrace();
		}
		
	}//main
	
}//classe