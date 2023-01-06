package Trabalho;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Lancha lancha = null;
		Iate iate = null;
		JetSki jetski = null;
		Scanner sc = new Scanner(System.in);
		//Lanchas
		
		Lancha lancha1 = new Lancha("", null, null, null, null, null, null, null, null, null, null, null);
		Lancha lancha2 = new Lancha(null, null, null, null, null, null, null, null, null, null, null, null);
		Lancha lancha3 = new Lancha(null, null, null, null, null, null, null, null, null, null, null, null);
		Lancha lancha4 = new Lancha(null, null, null, null, null, null, null, null, null, null, null, null);
		Lancha lancha5 = new Lancha(null, null, null, null, null, null, null, null, null, null, null, null);
		
		//Iates
		
		Iate iate1 = new Iate(null, null, null, null, null, null, null, null, null, null, null, null, null);
		Iate iate2 = new Iate(null, null, null, null, null, null, null, null, null, null, null, null, null);
		Iate iate3 = new Iate(null, null, null, null, null, null, null, null, null, null, null, null, null);
		Iate iate4 = new Iate(null, null, null, null, null, null, null, null, null, null, null, null, null);
		Iate iate5 = new Iate(null, null, null, null, null, null, null, null, null, null, null, null, null);
		
		//JetSkis
		JetSki jetski1 = new JetSki(null, null, null, null, null, null, null, null, null, null, null, null);
		JetSki jetski2 = new JetSki(null, null, null, null, null, null, null, null, null, null, null, null);
		JetSki jetski3 = new JetSki(null, null, null, null, null, null, null, null, null, null, null, null);
		JetSki jetski4 = new JetSki(null, null, null, null, null, null, null, null, null, null, null, null);
		JetSki jetski5 = new JetSki(null, null, null, null, null, null, null, null, null, null, null, null);
		
		menu2 menu = new menu2();

		
		menu.imprimirPrincipal();
		int i= sc.nextInt();
		switch(i) {
		case 1 ->
		{
			menu.imprimirLanchas(lancha1.getMarca(),lancha2.getMarca(),lancha3.getMarca(),lancha4.getMarca(),lancha5.getMarca());
			int j = sc.nextInt();
			switch(j) {
		
				case 1 ->{
					lancha.imprimir();
				}
				case 2 ->{
					}
				case 3 ->{
				}
				case 4 ->{
				}
				case 5 ->{
				}
				case 0 ->{
					break;
		}
			}
		}
		}
	}
}
		
		
		
		
	
		
	
