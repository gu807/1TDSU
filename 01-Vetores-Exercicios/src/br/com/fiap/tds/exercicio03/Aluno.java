package br.com.fiap.tds.exercicio03;

public class Aluno {
	
	private String nome;
	
	private int[] notas = new int[3];
	
	public Aluno() {}

	public Aluno(String nome, int[] notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public int recuperarMaiorNota() {
		int maiorNota = notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (maiorNota < notas[i]) {
				maiorNota = notas[i];
			}
		}
		return maiorNota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

}
