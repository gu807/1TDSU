package br.com.fiap.tds.bean;

/**
 * Classe que representa uma conta corrente
 * @author Thiago Yamamoto
 *
 */
public class ContaCorrente extends Conta {

	/**
	 * Inicializa uma conta corrente com número, agencia e saldo
	 * @param agencia agencia da conta
	 * @param numero número da conta com o dígito
	 * @param saldo saldo disponível na conta
	 */
	public ContaCorrente(int agencia, String numero, double saldo) {
		super(agencia, numero);
		this.saldo = saldo;
	}

	/**
	 * Exibe o extrato da conta a partir da qtd de dias informado
	 * @param quantidadeDias quantidade de dias para o extrato
	 */
	public void exibirExtrato(int quantidadeDias) {
		
	}
	
	/**
	 * @return saldo disponível na conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
	
}
