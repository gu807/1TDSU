package br.com.fiap.tds.bean;

/**
 * Classe que representa um restaurante
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Restaurante {

	//Atributos
	/**
	 * Nome do restaurante
	 */
	private String nome;
	
	/**
	 * Endereço do restaurante com número e complemento
	 */
	private String endereco;
	
	/**
	 * Custo-benefício do restaurante
	 */
	private int custo;
	
	/**
	 * Culinária principal do restaurante
	 */
	private Culinaria culinaria;
	
	/**
	 * Pratos servidos pelo restaurante
	 */
	private Prato[] pratos;
	
	//Construtores
	/**
	 * Inicializa um restaurante sem valores
	 */
	public Restaurante() {}

	/**
	 * Inicializa um restaurante com todas as informações do restaurante
	 * @param nome nome do restaurante
	 * @param endereco endereço do restaurante
	 * @param custo custo-benefício
	 * @param culinaria tipo de culinária principal
	 * @param pratos pratos servidos
	 */
	public Restaurante(String nome, String endereco, int custo, Culinaria culinaria, Prato[] pratos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.custo = custo;
		this.culinaria = culinaria;
		this.pratos = pratos;
	}

	//Gets/Sets
	/**
	 * @return nome do restaurante
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome nome do restaurante
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return endereço do restaurante com número e complemento
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco endereço do restaurante com número e complemento
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return custo-benefício do restaurante
	 */
	public int getCusto() {
		return custo;
	}

	/**
	 * @param custo custo-benefício do restaurante
	 */
	public void setCusto(int custo) {
		this.custo = custo;
	}

	/**
	 * @return culinária principal do restaurante
	 */
	public Culinaria getCulinaria() {
		return culinaria;
	}

	/**
	 * @param culinaria culinária principal do restaurante
	 */
	public void setCulinaria(Culinaria culinaria) {
		this.culinaria = culinaria;
	}

	/**
	 * @return pratos servidos pelo restaurante
	 */
	public Prato[] getPratos() {
		return pratos;
	}

	/**
	 * @param pratos pratos servidos pelo restaurante
	 */
	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}
	
	//Comentário de linha
	
	/* 
	  Comentário de várias linhas (bloco) 
	*/
	
}