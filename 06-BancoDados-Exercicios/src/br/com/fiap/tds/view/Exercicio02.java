package br.com.fiap.tds.view;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.fiap.tds.factory.ConnectionFactory;

public class Exercicio02 {

	//Ler os dados do banco (tabela tb_aluno) e gravar no arquivo
	public static void main(String[] args) {
		
		try {
			//Conexão com banco
			Connection conexao = ConnectionFactory.getConnection();
			
			//Statement
			Statement stmt = conexao.createStatement();
			
			//Abrir o arquivo
			FileWriter outputStream = new FileWriter("alunos-export.cvs");
			PrintWriter arquivo = new PrintWriter(outputStream);
			
			//Ler os registros do banco
			ResultSet resultado = stmt.executeQuery("SELECT * FROM TB_ALUNO");
			
			//Escrever a primeira linha do arquivo
			arquivo.println("RM;Nome;Ativo;Nota1;Nota2");
			
			//Percorrer todos os resultados encontrados
			while (resultado.next()) {
				//Ler todos os campos
				int rm = resultado.getInt("rm");
				String nome = resultado.getString("nome");
				boolean ativo = resultado.getBoolean("ativo");
				double nota1 = resultado.getDouble("nota1");
				double nota2 = resultado.getDouble("nota2");
				
				//Escrever no arquivo
				arquivo.println(rm + ";" + nome + ";" + ativo + ";" + nota1 + ";" + nota2);
			}			

			System.out.println("Dados exportados!");
			
			//Fechar
			stmt.close();
			conexao.close();
			arquivo.close();
			outputStream.close();
			
		}catch(Exception e) {
			System.out.println("Erro..");
			e.printStackTrace();
		}
		
	}//main
	
}//classe
