package br.com.fiap.tds.view;

public class Exemplo02 {

	public static void main(String[] args) {
		//Criar um vetor com os dias da semana
		String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", 
										"Quinta", "Sexta", "Sábado"};
		
		//Exibir o valor armazenado na terceira posição
		System.out.println(dias[2]);
		
		//Exibir o tamanho do vetor (qtd de posições)
		System.out.println("Posições no vetor: " + dias.length);
		
		//Exibir todos os dias da semana
		for (int i =0; i< dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		//Foreach
		System.out.println("Dias da semana com foreach");
		for(String item : dias) {
			System.out.println(item);
		}
		
	}
	
}
