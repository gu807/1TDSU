package br.com.fiap.tds.view;

import java.util.List;
import javax.swing.JOptionPane;
import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;

public class ExemploDaoPesquisaPorNome {

	public static void main(String[] args) {
		
		//Ler o nome
		String nome = JOptionPane.showInputDialog("Digite o nome");
		
		//Instanciar o FuncionarioDao
		FuncionarioDao dao = new FuncionarioDao();
		
		try {
			//Pesquisar por nome
			List<Funcionario> lista = dao.buscarPorNome(nome);
			
			//Exibir os resultados
			for(Funcionario f : lista) {
				System.out.println(f);
			}
			
		}catch(Exception e) {
			System.out.println("Erro..");
		}
		
	}//main
}//classe
