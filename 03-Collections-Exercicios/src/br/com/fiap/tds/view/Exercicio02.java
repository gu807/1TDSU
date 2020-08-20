package br.com.fiap.tds.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Aluno;

public class Exercicio02 {

	public static void main(String[] args) {
		//Ler a quantidade de alunos
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
		
		//Criar a lista de alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		//Loop -> ler os alunos
		for (int i=0; i < qtd; i++ ) {
			//Ler o nome
			String nome = JOptionPane.showInputDialog("Digite o nome:");
			//Ler a idade
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			//Criar a lista de notas
			List<Float> notas = new ArrayList<Float>();
			
			//Ler as notas
			String op;
			do {
				//Ler a nota
				float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota"));
				//Ler se deseja adicionar mais notas
				op = JOptionPane.showInputDialog("Deseja inserir mais uma nota? S/N");
				//Adicionar a nota na lista de notas do aluno
				notas.add(nota);
			} while (op.equalsIgnoreCase("S"));
			
			//Instanciar um aluno com os valores
			Aluno aluno = new Aluno(nome, idade, notas);
			//Adicionar na lista
			alunos.add(aluno);
			//alunos.add(new Aluno(nome, idade, notas));
		}//for
	
		//Loop -> percorrer a lista e identificar os valores
		float somaNotas = 0;//somatório das médias 
		int somaIdade = 0; //somatório das idades
		int maiorIdade = 0; //armazena a maior idade
		int menorIdade = alunos.get(0).getIdade(); //armazena a menor idade
		for (Aluno a : alunos) {
			//Adiciona a media do aluno no somatório
			somaNotas += a.getMedia();
			//Adiciona a idade do aluno no somatório
			somaIdade += a.getIdade();
			//Valida se a idade do aluno é maior do que a já encontrada
			if (maiorIdade < a.getIdade())
				maiorIdade = a.getIdade();
			//Valida se a idade do aluno é menor do que a já encontrada
			if (menorIdade > a.getIdade())
				menorIdade = a.getIdade();
		}
		
		System.out.println(alunos);
		
		//Exibir a quantidade de alunos
		System.out.println("Quantidade de alunos: " + alunos.size());
		//Exibir a média geral de notas e média geral de idade
		System.out.println("Média geral de notas: " + somaNotas/alunos.size());
		System.out.println("Média geral de idades: " + somaIdade/alunos.size());
		//Exibir a maior e menor idade
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Menor idade: " + menorIdade);
		
		/*
		 * i) Imprimir os nomes e médias de todos os alunos
		  ii) Imprimir apenas os nomes dos alunos que possuem média acima de 6.0
	      iii) Imprimir apenas os nomes dos alunos que possuem idade acima de 30 anos
		  iv) Excluir os alunos com médias menores que 3.0 
		  v) Sair do sistema
		 */
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Nomes e médias "
				+ "\n 2 - Alunos acima de média 6"
				+ "\n 3 - Alunos acima de 30 anos"
				+ "\n 4 - Excluir alunos com média < 3"
				+ "\n 5 - Sair"));
		
		while (op != 5) {
			switch (op) {
			case 1:
				System.out.println("Nomes e médias");
				for (Aluno aluno : alunos) {
					System.out.println(aluno.getNome() + " - " + aluno.getMedia());
				}
				break;
			case 2:
				System.out.println("Médias acima de 6");
				for (Aluno aluno : alunos) {
					if (aluno.getMedia() > 6)
						System.out.println(aluno.getNome() + " - " + aluno.getMedia());
				}
				break;
			case 3:
				System.out.println("Idade acima de 30");
				for (Aluno aluno : alunos) {
					if (aluno.getIdade() > 30)
						System.out.println(aluno.getNome() + " - " + aluno.getIdade());
				}
				break;
			case 4:
				System.out.println("Removendo media menor que 3");
				for (int i =0; i < alunos.size(); i++) {
					if (alunos.get(i).getMedia() < 3) {
						alunos.remove(i);
						i--;
					}
				}
				break;
			default:
				System.out.println("Opção inválida");
			}//switch
			
			op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Nomes e médias "
					+ "\n 2 - Alunos acima de média 6"
					+ "\n 3 - Alunos acima de 30 anos"
					+ "\n 4 - Excluir alunos com média < 3"
					+ "\n 5 - Sair"));
			
		}//while
		
	}//main
	
}//classe



