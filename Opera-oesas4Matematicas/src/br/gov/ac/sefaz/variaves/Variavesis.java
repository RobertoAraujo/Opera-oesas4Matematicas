package br.gov.ac.sefaz.variaves;

public class Variavesis {

	public static void main(String[] args) {
		
		int numero;
		String nome;
		double dobro;
		
		dobro = 2.76;
		numero = 9;
		nome = "roberto porra";
		
		double result = dobro + numero;
		
		System.out.println("o double é "+dobro);
		System.out.println("o numero é "+numero);
		System.out.println("seu nome é "+nome);
		
		System.out.println(" aqui o resultado " + result);
		
		for(int x =1; x <= 30; x++) {
			System.out.print(","+x);
		}
		
		System.out.println(" ");
		int y= 1;
		if(y < 50) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		System.out.println(" ");
		
		int t= 1;
		while(t <= 30) {
			System.out.print(","+t);
			t++;
		}
		System.out.println(" ");
		
	}

}
