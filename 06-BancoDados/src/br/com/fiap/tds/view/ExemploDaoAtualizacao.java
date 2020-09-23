package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;
import br.com.fiap.tds.exception.FuncionarioNaoEncontradoException;

public class ExemploDaoAtualizacao {

	public static void main(String[] args) {
		
		//Ler os dados do funcionário
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String data = JOptionPane.showInputDialog("Digite a data");
		boolean ativo = JOptionPane.showConfirmDialog(null,"Ativo?") == JOptionPane.YES_OPTION;
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
		
		//Instanciar o FuncionarioDAO
		FuncionarioDao dao = new FuncionarioDao();
		
		//Instanciar o Funcionario
		Funcionario funcionario = new Funcionario(codigo, nome, ativo, salario, data);
		
		try {
			//Chamar o método de atualizar um funcionário
			dao.atualizar(funcionario);
			JOptionPane.showMessageDialog(null, "Funcionário atualizado");
			
		}catch(FuncionarioNaoEncontradoException e) {
			JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro...");
		}
		
	}
	
}
