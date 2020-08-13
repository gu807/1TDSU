package br.com.fiap.tds.bean;

public class Prato {

	//Atributos
	private String nome;
	
	private double valor;
	
	private boolean disponivel;

	//Construtores
	public Prato() {}

	public Prato(String nome, double valor, boolean disponivel) {
		this.nome = nome;
		this.valor = valor;
		this.disponivel = disponivel;
	}

	//Gets/Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
