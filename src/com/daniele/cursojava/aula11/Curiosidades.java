package com.daniele.cursojava.aula11;

public class Curiosidades {

	public static void main(String[] args) {
		
		int var1 = 2147483647;
		
		int var2= 100;
		
		System.out.println(var1 + var2); // quando chega no limite, ele volta para o número menor, no caso negativo. Roleta Russa
	}
}
