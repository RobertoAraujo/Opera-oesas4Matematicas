package br.gov.ac.sefaz.variaves;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("[ Seja Bem vindo a Nossa Calculadora ] ");
		System.out.println("  ");
		System.out.println("      [ 1. soma  ]");
		System.out.println("      [ 2. subtração ]");
		System.out.println("      [ 3. multimplicaçao ]");
		System.out.println("      [ 4. Divisão ]");
		System.out.println("      [ 5. Sair ]");
		
		for(int opcao =0; opcao <=5; opcao++) {
		System.out.println("Entre com uma opção : ");
		//int opcao  ;
		
		switch (opcao = entrada.nextInt()) {
			case 1:
				Scanner entrada1 = new Scanner(System.in);
				System.out.println("Você escolheu a primeira opção! Seja Bem vindo a Soma ");

				System.out.println("entre com numero 1 ");
				int x = entrada1.nextInt();
				System.out.println("entre com numero 2 ");
				int y = entrada1.nextInt();

				int resultado = x + y;
				System.out.println("Resultado da Soma é :" + resultado);
				System.out.println("");
				break;

			case 2:
				Scanner entrada2 = new Scanner(System.in);
				System.out.println("Você escolheu a segunda opção! Seja Bem vindo a subtração ");

				System.out.println("entre com numero 1 ");
				int q = entrada2.nextInt();
				System.out.println("entre com numero 2");
				int w = entrada2.nextInt();

				int volta1 = q - w;
				System.out.println("Resultado da subtração é :" + volta1);
				System.out.println("");
				break;

			case 3:
				Scanner entrada3 = new Scanner(System.in);
				System.out.println("Você escolheu a terceira opção! Seja Bem vindo a multiplicação ");

				System.out.println("entre com numero 1 ");
				int v = entrada3.nextInt();
				System.out.println("entre com numero 2 ");
				int c = entrada3.nextInt();

				int volta = v * c;
				System.out.println("Resultado é multiplicação :" + volta);
				System.out.println("");
				break;

			case 4:
				Scanner entrada4 = new Scanner(System.in);
				System.out.println("Você escolheu a quarta opção! Seja Bem vindo a Divisão ");

				System.out.println("entre com numero 1 ");
				int r = entrada4.nextInt();
				System.out.println("entre com numero 2 ");
				int e = entrada4.nextInt();

				int volta2 = r / e;
				System.out.println("Resultado da divisão é :" + volta2);
				System.out.println("");
				break;
				
			default:
				System.out.println("Opa você Digitou Opçaõ que não esta no menu! Você saiu do programa execute novamente!");
				break;

			}
		
		}
		entrada.close();
	}

}
