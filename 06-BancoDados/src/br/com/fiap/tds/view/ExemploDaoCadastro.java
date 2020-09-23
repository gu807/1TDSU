package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;

public class ExemploDaoCadastro {

	//Cadastrar um funcionário com os dados do usuário, utilizando o DAO
	public static void main(String[] args) {
		
		//Instanciar o FuncionarioDao
		FuncionarioDao dao = new FuncionarioDao();
		
		//Ler os dados do funcionário
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String data = JOptionPane.showInputDialog("Digite a data");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
		boolean ativo = 
			JOptionPane.showConfirmDialog(null, "Funcionário ativo?") == JOptionPane.YES_OPTION;
		
		//Instanciar o funcionário com os dados
		Funcionario funcionario = new Funcionario(0, nome, ativo, salario, data);
		
		try {
			//Chamar o método cadastrar do dao, passando o funcionário
			dao.cadastrar(funcionario);
			
			//Mensagem de sucesso
			System.out.println("Funcionário cadastrado");
		}catch(Exception e) {
			System.out.println("Erro ao cadastrar");
			e.printStackTrace();
		}
		
	}
	
}