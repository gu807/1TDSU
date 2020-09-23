package br.com.fiap.tds.view;

import javax.swing.JOptionPane;
import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;

public class ExemploDaoPesquisa {

	public static void main(String[] args) {
		//Instanciar o Dao
		FuncionarioDao dao = new FuncionarioDao();
		
		//Ler o código
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		
		try {
			//Pesquisar o funcionário pelo código
			Funcionario funcionario = dao.pesquisar(codigo);
			
			//Exibir os dados ou informar que não encontrou
			if (funcionario != null) {
				JOptionPane.showMessageDialog(null, funcionario.getNome() 
						+ "\nSalário: " + funcionario.getSalario()
						+ "\nData: " + funcionario.getDataNascimento()
						+ "\nAtivo: " + funcionario.isAtivo());
			}else {
				JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao pesquisar");
			e.printStackTrace();
		}
		
	}//main
	
}//classe
