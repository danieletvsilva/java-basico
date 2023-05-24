package com.daniele.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean vdd = true;
		boolean falso = false;
		boolean result = falso & vdd;
		boolean result1 = falso && vdd; //programa verifica o primeiro falso e já sabe que a resposta será false. Então ela não verifica a segunda condição.
		System.out.println(result);		
		System.out.println(result1);		
	}
}
