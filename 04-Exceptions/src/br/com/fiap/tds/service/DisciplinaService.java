package br.com.fiap.tds.service;

import br.com.fiap.tds.exception.NotaInvalidaException;

public class DisciplinaService {

	
	//Exception (ou filhas) -> checked exception -> é necessário "avisar" a possibilidade da exceção ocorrer
	public float calcularMedia(float nota1, float nota2) throws NotaInvalidaException {
		if (nota1 < 0 || nota2 < 0) {
			//Lancar uma exception
			throw new NotaInvalidaException("Nota deve ser maior que zero");
		}
		//Ao lançar a exceção, o fluxo do código é redirecionado para quem chamou o método
		//Então, nada mais no método é excutado
		System.out.println("Calculando a média...");
		return (nota1 + nota2)/2;
	}
	
	
	//IllegalArgumentException -> unchecked exception -> não é obrigatório tratar a exceção (tempo de excecução)
	public float calcularMedia(float nota1, float nota2, float nota3) {
		if (nota1 < 0 || nota2 <0 || nota3 < 0) {
			throw new IllegalArgumentException("Nota deve ser maior do que zero");
		}
		return (nota1 + nota2 + nota3)/3;
	}
	
}