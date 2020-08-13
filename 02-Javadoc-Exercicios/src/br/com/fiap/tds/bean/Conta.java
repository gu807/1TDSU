package br.com.fiap.tds.bean;

/**
 * Classe que representa uma conta
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Conta {
	
	/**
	 * Número da agencia
	 */
	private int agencia;
	
	/**
	 * Número da conta, com dígito
	 */
	private String numero;
	
	/**
	 * Saldo da conta
	 */
	protected double saldo;

	/**
	 * Inicializa uma conta sem valores
	 */
	public Conta() {}

	/**
	 * Inicializa uma conta com agencia e número
	 * @param agencia número da agencia
	 * @param numero número da conta, com dígito
	 */
	public Conta(int agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * @return número da agencia da conta
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia número da agencia da conta
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return número da conta, com dígito
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero número da conta, com dígito
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
