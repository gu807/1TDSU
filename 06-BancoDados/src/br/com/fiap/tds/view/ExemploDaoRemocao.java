package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.dao.FuncionarioDao;
import br.com.fiap.tds.exception.FuncionarioNaoEncontradoException;

public class ExemploDaoRemocao {

	public static void main(String[] args) {
		
		//Ler o código
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		
		//Instanciar o FuncionarioDao
		FuncionarioDao dao = new FuncionarioDao();
		
		try {
			//Chamar o método de remover
			dao.remover(codigo);
			
			JOptionPane.showMessageDialog(null, "Funcionário removido!");
			
		}catch(FuncionarioNaoEncontradoException e) {
			JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro..");
		}
		
	}
	
}
