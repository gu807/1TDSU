package br.com.fiap.tds.exercicio03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		//Mapa com (chave, valor) => (UF, DDDs)
		Map<String,Set<Short>> mapa = new HashMap<String,Set<Short>>();
		
		int opcao;
		
		do {
		
			//Menu
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("Digite: \n1-Cadastrar \n2-Consultar \n3-Sair"));
			
			switch (opcao) {
			case 1:
				//Ler o estado para cadastro
				String uf = JOptionPane.showInputDialog("Digite o estado (Sigla)");
				//Conjunto para armazenar os ddds
				Set<Short> ddds;
				//Valida se o mapeamento já existe
				if (mapa.containsKey(uf)) {
					//Recupera os ddds já cadastrados
					ddds = mapa.get(uf);
				}else {
					//Conjunto para armazena os ddds, sem repetir os valores
					ddds = new HashSet<Short>();
				}
				//Loop -> Ler os ddds
				do {
					//Ler o ddd
					short ddd = Short.parseShort(JOptionPane.showInputDialog("Digite o DDD"));
					//Adiciona o ddd no conjunto
					ddds.add(ddd); 
				//Enquanto o usuário escolher YES	
				} while( JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um ddd?")
						== JOptionPane.YES_OPTION);
				//adicionando o mapeamento UF, DDDs
				mapa.put(uf, ddds); 
				break;
			case 2:
				//Ler o estado para consulta
				uf = JOptionPane.showInputDialog("Digite o estado (sigla)");
				//Validar se existe a chave no mapeamento
				if (mapa.containsKey(uf)) {
					//Recuperar os ddds do mapa, através da chave (estado)
					Set<Short> set = mapa.get(uf);
					//Exibe os valores dos ddds
					JOptionPane.showMessageDialog(null, set);
				} else {
					JOptionPane.showMessageDialog(null, "Estado não cadastrado!");
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Obrigado! Volte sempre!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		
		} while(opcao != 3);
		
	}//main
	
}//classe
