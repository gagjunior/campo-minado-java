package br.com.gagjunior.cm;

import br.com.gagjunior.cm.modelo.Tabuleiro;
import br.com.gagjunior.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tab = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tab);
		
	}

}

