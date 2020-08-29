package br.com.fiap.tds.vetor.exercicio03;

import java.util.List;

public class Aluno {
	
	private String nome;
	
	private List<Float> notas;
	
	public Aluno() {}
	
	public Aluno(String nome, List<Float> notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Float> getNotas() {
		return notas;
	}

	public void setNotas(List<Float> notas) {
		this.notas = notas;
	}

	public float recuperarMaiorNota() {
		float maior = 0;
		for (Float nota : notas) {
			if (nota > maior)
				maior = nota;
		}
		return maior;
	}

}
