package br.com.fiap.tds.bean;

import java.util.List;

public class Aluno {

	private String nome;
	
	private int idade;
	
	private List<Float> notas;
	
	public Aluno() {}

	public Aluno(String nome, int idade, List<Float> notas) {
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}
	
	//Método que retorna a média de notas do aluno
	public float getMedia() {
		float total = 0;
		//Loop -> somar todas as notas do aluno
		for (float nota : notas) {
			total += nota;
		}
		return total/notas.size(); //retorna a divisao da soma das notas pela qtd de notas
	}
	
	//Método para exibir os dados do aluno
	@Override
	public String toString() {
		return nome + " Idade: " + idade + " Notas:" + notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Float> getNotas() {
		return notas;
	}

	public void setNotas(List<Float> notas) {
		this.notas = notas;
	}
	
}
