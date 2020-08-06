package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Disciplina;

public class Exemplo03 {

	public static void main(String[] args) {
		//Instanciar uma classe Aluno
		Aluno aluno = new Aluno();
		
		//Atribuir um nome e 4 notas
		aluno.setNome("Maria");
		
		int[] notas = new int[4];
		//int[] notas = {10, 9, 10, 6};
		notas[0] = 10;
		notas[1] = 9;
		notas[2] = 10;
		notas[3] = 6;
		
		aluno.setNotas(notas);
		
		//Atribuir duas disciplinas para o aluno
		Disciplina[] disciplinas = new Disciplina[2];
		
		disciplinas[0] = new Disciplina("DDD", 160);
		//disciplinas[0].setCargaHoraria(160);
		disciplinas[1] = new Disciplina("Banco", 80);
		
		aluno.setDisciplinas(disciplinas);
		
		//Exibir o nome da disciplina da primeira posição do aluno
		System.out.println(aluno.getDisciplinas()[0].getNome());
		
		System.out.println("Disciplinas:");
		//Exibir o nome e a carga horária das disciplinas do aluno
		for (int i=0; i < aluno.getDisciplinas().length ; i ++ ) {
			System.out.println("Nome: " + aluno.getDisciplinas()[i].getNome());
			System.out.println("Horas: "+ aluno.getDisciplinas()[i].getCargaHoraria());
		}
		
		//Foreach
		for (Disciplina item : aluno.getDisciplinas()) {
			System.out.println("Nome: " + item.getNome());
			System.out.println("Horas: " + item.getCargaHoraria());
		}
		
	}
	
}
