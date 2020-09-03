package br.com.fiap.bean;

public class Mercado {
	
	private String nome;
	
	private String endereco;
	
	private long cnpj;
	
	private int unidades;

	public Mercado() {}
	
	public Mercado(String nome, String endereco, long cnpj, int unidades) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.unidades = unidades;
	}
	
	public String toString() {
		return  " Nome: "+ nome + 
				" Endereço: " + endereco + 
				" Cnpj: " + cnpj + 
				" Unidades: " + unidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
}