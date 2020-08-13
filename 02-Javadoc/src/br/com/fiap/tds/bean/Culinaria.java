package br.com.fiap.tds.bean;

/**
 * Classe que representa a culinária de um restaurante
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Culinaria {

	//Atributos
	private String tipo;
	
	private String nacionalidade;
	
	//Construtores
	/**
	 * Inicializa uma culinária sem valores
	 */
	public Culinaria() {}

	/**
	 * Inicializa uma culinária com o tipo de nacionalidade
	 * @param tipo tipo da culinária
	 * @param nacionalidade nacionalidade que a culinária representa
	 */
	public Culinaria(String tipo, String nacionalidade) {
		this.tipo = tipo;
		this.nacionalidade = nacionalidade;
	}

	//Gets/Sets
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}
