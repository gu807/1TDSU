package br.com.fiap.tds.view;

import java.util.List;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;

public class ExemploDaoLista {
	
	public static void main(String[] args) {
		//Instanciar o Funcionario Dao
		FuncionarioDao dao = new FuncionarioDao();
		
		try {
		//Chamar o método listar e armazenar em uma lista de funcionário
		List<Funcionario> lista = dao.listar();
		
		//Exibir os funcionários encontrados
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.getCodigo() + " " + 
					funcionario.getNome() + " " + funcionario.getDataNascimento() + " "
					+ funcionario.isAtivo() + " " + funcionario.getSalario());
		}
		
		} catch(Exception e) {
			System.out.println("Erro..");
			e.printStackTrace();
		}
		
	}

}
