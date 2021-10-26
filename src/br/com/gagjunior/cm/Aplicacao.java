package br.com.gagjunior.cm;

import br.com.gagjunior.cm.modelo.Tabuleiro;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		System.out.println("Teste1");
		
		Tabuleiro tab = new Tabuleiro(6, 6, 6);
		
		tab.abrir(3, 3);
		tab.alternarMarcacao(4, 4);
		tab.alternarMarcacao(4, 5);
		
		System.out.println(tab);
	}

}

