package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {

		try {
			// NumberFormatException -> Exception
			int op = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			System.out.println("Opção escolhida: " + op);

			// NullPointerExceptions -> Exception
			String nome = null;
			//nome.charAt(1);

		//Sempre as exceções mais específicas primeiro e as geral por último
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println("Número inválido ou index inválido");
		} catch (NullPointerException e) {
			System.out.println("Objeto está vazio!");
		} catch (Exception e) {
			System.out.println("Tente novamente mais tarde..");
		} finally {
			System.out.println("Finally - Sempre executado!");
		}

	}
}