package br.com.fiap.tds.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.fiap.tds.exception.NotaInvalidaException;
import br.com.fiap.tds.service.DisciplinaService;

public class ExemploDisciplina {

	public static void main(String[] args) {
		
		//Ler duas notas e chamar o método de calcular médias
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
			System.out.println("Digite a nota 1:");
			float nota1 = sc.nextFloat();
			System.out.println("Digite a nota 2:");
			float nota2 = sc.nextFloat();
			
			//Instancia a disciplina service
			DisciplinaService service = new DisciplinaService();
			
			//Chama o método de calcular médias e exibe o resultado
			System.out.println("Média: " + service.calcularMedia(nota1, nota2));
			
		} catch(InputMismatchException e) { 
			System.out.println("Digite um número!");
		} catch(NotaInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //Exibe a pilha de execução do código que gerou a exception
		} finally {
			sc.close();//fechando o recurso aberto
		}
		
		/*
		DisciplinaService service = new DisciplinaService();
		//Exemplo de lançamento de unchecked exception, não é obrigado a tratar.
		service.calcularMedia(10, 10, -10);
		//Exemplo de lançamento de checked exception, é obrigado tratar ou propagar
		service.calcularMedia(10, 10);
		*/
	}
}
