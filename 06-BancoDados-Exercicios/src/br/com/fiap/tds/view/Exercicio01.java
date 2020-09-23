package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.tds.factory.ConnectionFactory;

public class Exercicio01 {

	//Ler um arquivo e gravar os dados no banco
	public static void main(String[] args) {
		
		try {
			//Abrir a conexão com banco
			Connection conexao = ConnectionFactory.getConnection();
			
			//Obter um statement
			Statement stmt = conexao.createStatement();
			
			//Ler o arquivo
			FileReader inputStream = new FileReader("alunos.cvs");
			BufferedReader arquivo = new BufferedReader(inputStream);
			
			String linha; //auxiliar
			
			arquivo.readLine(); //ler a primeira linha do arquivo (cabeçalho)
			
			//Percorrer todas as linhas do arquivo
			while ((linha = arquivo.readLine()) != null) {
				//Separar os dados da linha
				String[] valores = linha.split(";");
				//Insere os dados na tabela
				stmt.executeUpdate("INSERT INTO TB_ALUNO (ID, RM, NOME, ATIVO, NOTA1, NOTA2)"
					+ " VALUES (SQ_TB_ALUNO.NEXTVAL, " + valores[0] +  ",'" + valores[1] + "'," 
					+ (valores[2].equals("true")?1:0) + "," + valores[3] + "," + valores[4]+ ")");
			}
			
			//ternário -> (condicao?true:false)
			System.out.println("Dados importados!");
			//Fechar
			stmt.close();
			conexao.close();
			arquivo.close();
			inputStream.close();
		
		}catch(ClassNotFoundException e) {
			System.out.println("Driver do banco não encontrado");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Erro ao conectar no banco ou executar o insert");
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("Erro ao ler o arquivo");
			e.printStackTrace();
		}
	}//main
	
}//classe