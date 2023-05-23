package com.daniele.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 +2;
		System.out.println(resultado);
		
		resultado -= 1;
		System.out.println(resultado);
		
		resultado *= 2;
		System.out.println(resultado);

		resultado /= 2;
		System.out.println(resultado);
		
		resultado += 8;
		System.out.println(resultado);
		
		resultado %= 7;
		System.out.println(resultado);
		
		String primeiraString = "Está é";
		String segundaString = " uma String concatenada.";
		String terceiraString = primeiraString + segundaString;
		System.out.println(terceiraString);
		
		resultado ++;
		System.out.println(resultado++);
		System.out.println(++resultado);
		
		System.out.println(--resultado);
		System.out.println(resultado--);
		System.out.println(resultado);
				
	}

}
