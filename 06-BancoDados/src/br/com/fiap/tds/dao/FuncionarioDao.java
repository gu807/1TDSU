package br.com.fiap.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.factory.ConnectionFactory;

/**
 * Classe responsável por realizar as operações (CRUD) do funcionário com o banco
 * Cadatrar, Atualizar, Remover ou Pesquisar um funcionário
 * @author Thiago T I Yamamoto
 * @version 1.0
 */
public class FuncionarioDao {
 
	/**
	 * Atualiza as informações do funcionário 
	 * @param funcionario
	 */
	public void atualizar(Funcionario funcionario) {
		//Conexão com o banco
		
		//Prepared Statement
		
		//Passar os valores para a query
		
		//Executar a query
		
		//Fechar a conexão
	}
	
	/**
	 * Recupera todos os funcionários cadastrados
	 * @return List<Funcionario> lista de funcionários
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Funcionario> listar() throws ClassNotFoundException, SQLException{
		//Conexão com banco
		Connection conexao = ConnectionFactory.getConnection();
		//Prepared Statement ou Statement
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM TB_FUNCIONARIO");
		
		//Criar a lista de Funcionário
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		//Executar a query
		ResultSet resultado = stmt.executeQuery();
		
		//Percorrer todos os registros encontrados
		while(resultado.next()) {		
			//Recuperar os dados do registro
			int codigo = resultado.getInt("CD_FUNCIONARIO");
			String nome = resultado.getString("NM_FUNCIONARIO");
			String data = resultado.getString("DT_NASCIMENTO");
			double salario = resultado.getDouble("VL_SALARIO");
			boolean ativo = resultado.getBoolean("ST_ATIVO");
			
			//Instanciar o funcionário e adicionar na lista
			Funcionario funcionario = new Funcionario(codigo, nome, ativo, salario, data);
			lista.add(funcionario);
		}
		
		//Fechar
		stmt.close();
		conexao.close();
		
		//Retornar a lista
		return lista;
	}
	
	/**
	 * Pesquisa um funcionário pelo código (PK)
	 * @param codigo
	 * @return Funcionario ou null, caso não exista no banco
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Funcionario pesquisar(int codigo) throws ClassNotFoundException, SQLException{
		//Conexão com o banco
		Connection conexao = ConnectionFactory.getConnection();
		//Prepared Statement
		PreparedStatement stmt = conexao
			.prepareStatement("SELECT * FROM TB_FUNCIONARIO WHERE CD_FUNCIONARIO = ?");
		
		//Passar o codigo para a query
		stmt.setInt(1, codigo);
		
		//Executar 
		ResultSet resultado = stmt.executeQuery();

		//Valida se encontrou o funcionário
		if (resultado.next()) {
			//Recuperar o resultado do result set
			String nome = resultado.getString("NM_FUNCIONARIO");
			int cd = resultado.getInt("CD_FUNCIONARIO");
			boolean ativo = resultado.getBoolean("ST_ATIVO");
			double salario = resultado.getDouble("VL_SALARIO");
			String data = resultado.getString("DT_NASCIMENTO");
			
			//Instanciar o funcionário
			Funcionario funcionario = new Funcionario(cd, nome, ativo, salario, data);
			
			//Retornar o funcionário
			return funcionario;
			
		}else {
			return null;
		}
	}
	
	/**
	 * Cadastra um funcionário no banco de dados
	 * @param funcionario
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void cadastrar(Funcionario funcionario) throws SQLException, ClassNotFoundException {
		//Conexão com o banco
		Connection conexao = ConnectionFactory.getConnection();
		//Prepared Statement
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO TB_FUNCIONARIO "
			+ " (CD_FUNCIONARIO, NM_FUNCIONARIO, ST_ATIVO, DT_NASCIMENTO, VL_SALARIO) "
			+ " VALUES (SQ_TB_FUNCIONARIO.NEXTVAL, ?, ?, ?, ?)");
		
		//Passar os parâmetros para a query
		stmt.setString(1, funcionario.getNome()); //seta a primeira ? na query
		stmt.setBoolean(2, funcionario.isAtivo()); //seta a segunda ? na query
		stmt.setString(3, funcionario.getDataNascimento()); //seta a terceira ? na query
		stmt.setDouble(4, funcionario.getSalario()); //seta a quarta ? na query
		
		//Executar
		stmt.executeUpdate();
		
		//Fechar
		stmt.close();
		conexao.close();
	}
	
}