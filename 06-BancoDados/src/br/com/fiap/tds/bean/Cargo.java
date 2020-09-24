package br.com.fiap.tds.bean;

//CRIAR O DAO PARA O CARGO

public class Cargo {

	private int codigo;
	
	private String nome;
	
	public Cargo() {}

	public Cargo(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}