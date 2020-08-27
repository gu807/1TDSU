package br.com.fiap.tds.exception;

//checked -> extends Exception
//unchecked -> extends RuntimeException

public class NotaInvalidaException extends Exception {
	
	//Construtores
	public NotaInvalidaException() {
		super("Nota inválida");
	}
	
	public NotaInvalidaException(String mensagem) {
		super(mensagem);
	}
	
}