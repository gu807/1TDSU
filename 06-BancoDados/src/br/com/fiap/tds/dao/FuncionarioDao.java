package br.com.fiap.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.exception.FuncionarioNaoEncontradoException;
import br.com.fiap.tds.factory.ConnectionFactory;

/**
 * Classe responsável por realizar as operações (CRUD) do funcionário com o banco
 * Cadatrar, Atualizar, Remover ou Pesquisar um funcionário
 * @author Thiago T I Yamamoto
 * @version 1.0
 */
public class FuncionarioDao {
	
	//Método privado que recebe um ResultSet e retorna um objeto do tipo funcionário
	private Funcionario parse(ResultSet resultado) throws SQLException {
		
		int codigo = resultado.getInt("CD_FUNCIONARIO");
		String nome = resultado.getString("NM_FUNCIONARIO");
		String data = resultado.getString("DT_NASCIMENTO");
		boolean ativo = resultado.getBoolean("ST_ATIVO");
		double salario = resultado.getDouble("VL_SALARIO");
		
		Funcionario funcionario = new Funcionario(codigo, nome, ativo, salario, data);
		
		return funcionario;
	}
	
	
	/**
	 * Pesquisa os funcionários por parte do nome
	 * @param nome
	 * @return List<Funcionario> funcionários encontrados
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Funcionario> buscarPorNome(String nome) throws ClassNotFoundException, SQLException{
		//Obter a conexão
		Connection conexao = ConnectionFactory.getConnection();
		
		//Prepared Statement
		PreparedStatement stmt = conexao
				.prepareStatement("SELECT * FROM TB_FUNCIONARIO WHERE NM_FUNCIONARIO like ?");
		
		//Passar o valor para a query
		stmt.setString(1, "%" +  nome + "%");
		
		//Criar a lista de funcionários
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		//Executar a query e obter os resultados
		ResultSet resultado = stmt.executeQuery();
		
		//Percorrer os resultados
		while (resultado.next()) {
		
			//Obter os dados das colunas
			Funcionario funcionario = parse(resultado);
			//Criar o objeto funcionário e adicionar na listar
			lista.add(funcionario);
		}
		
		//Fechar
		stmt.close();
		conexao.close();
		
		//Retornar a lista
		return lista;
	}
	
	/**
	 * Remove um funcionário pelo código
	 * @param id
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws FuncionarioNaoEncontradoException 
	 */
	public void remover(int id) 
			throws ClassNotFoundException, SQLException, FuncionarioNaoEncontradoException {
		//Obter a conexão
		Connection conexao = ConnectionFactory.getConnection();
		
		//Prepared Statement
		PreparedStatement stmt = conexao
				.prepareStatement("DELETE FROM TB_FUNCIONARIO WHERE CD_FUNCIONARIO = ?");
		
		//Setar o código na query
		stmt.setInt(1, id);
		
		//Executar a query
		int qtd = stmt.executeUpdate();
		
		//Verifica se removeu um funcionário
		if (qtd == 0)
			throw new FuncionarioNaoEncontradoException();
		
		//Fechar
		stmt.close();
		conexao.close();
	}
 
	/**
	 * Atualiza as informações do funcionário 
	 * @param funcionario
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws FuncionarioNaoEncontradoException Funcionário não foi encontrado para atualização
	 */
	public void atualizar(Funcionario funcionario) 
			throws ClassNotFoundException, SQLException, FuncionarioNaoEncontradoException {
			
		//Verifica se o funcionário existe no banco
		//Funcionario busca = pesquisar(funcionario.getCodigo());
		//if (busca == null) {
		//	throw new FuncionarioNaoEncontradoException();
		//}

		//Conexão com o banco
		Connection conexao = ConnectionFactory.getConnection();
		
		//Prepared Statement
		PreparedStatement stmt = conexao.prepareStatement("UPDATE TB_FUNCIONARIO SET"
			+ " NM_FUNCIONARIO = ?, ST_ATIVO = ?, DT_NASCIMENTO =?, VL_SALARIO = ? WHERE CD_FUNCIONARIO = ?");
		
		//Passar os valores para a query
		stmt.setString(1, funcionario.getNome());
		stmt.setBoolean(2, funcionario.isAtivo());
		stmt.setString(3, funcionario.getDataNascimento());
		stmt.setDouble(4, funcionario.getSalario());
		
		stmt.setInt(5, funcionario.getCodigo());
		
		//Executar a query (retorna a quantidade de linhas que foram modificadas)
		int qtd = stmt.executeUpdate();
		
		//Verifica se modificou alguma linha no banco de dados
		if (qtd == 0) {
			throw new FuncionarioNaoEncontradoException();
		}
		
		//Fechar a conexão
		stmt.close();
		conexao.close();
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
			
			//Chama o método que obtem o funcionário do resultset
			Funcionario funcionario = parse(resultado);
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
		
		Funcionario funcionario = null;
		
		//Valida se encontrou o funcionário
		if (resultado.next()) {
		
			//Chamar o método que obtem o funcionário do resultset
			funcionario = parse(resultado);
			
		}
		
		//Fechar
		stmt.close();
		conexao.close();		
		
		//Retornar o funcionário
		return funcionario;
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