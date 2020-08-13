package br.com.fiap.tds.exercicio03;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler a quantidade de alunos
		System.out.println("Digite a qtd de alunos");
		int qtd = leitor.nextInt();
		
		//Criar um vetor de alunos com a qtd informada
		Aluno[] alunos = new Aluno[qtd];
		
		//Loop -> Ler o nome e as notas do aluno
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome do aluno");
			String nome = leitor.next();
			
			
			//Criar um vetor com as notas do aluno
			int[] notas = new int[3];
			
			for (int j = 0; j < notas.length; j++) {
			
				System.out.println("Digite a nota" + (i + 1)  + "do aluno");
				notas[i] = leitor.nextInt();
				
			}
			
			//Criar um aluno e adicionar no vetor
			alunos[i] = new Aluno(nome, notas);
			
		}
		
		//Variável que armazena a maior nota do primeiro aluno do vetor
		int maiorNota = alunos[0].recuperarMaiorNota();
		
		//Loop -> identificar o aluno com a maior nota
		for (int i=1; i < alunos.length; i++) {
			if (maiorNota < alunos[i].recuperarMaiorNota()) {
				maiorNota = alunos[i].recuperarMaiorNota();
			}
		}
		
		String[] nomes = new String[qtd];
		int i = 0;
		for (Aluno a : alunos) {
			if (a.recuperarMaiorNota() == maiorNota) {
				nomes[i] = a.getNome();
				i++;
			}
		}
		
		//Informar o aluno com a maior nota
		System.out.println("Maior nota " + maiorNota);
		for (String nome : nomes) {
			if (nome != null)
				System.out.println(nome);
		}
		
		leitor.close();
	}
	
}
