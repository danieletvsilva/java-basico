package com.daniele.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine(); //Lê a linha inteira
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next(); // Lê só uma string
		System.out.println("Seu primeiro nome é: " + primeiroNome);

		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Qual a sua altura?  ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, bichos de estimação: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Filhos: " + qtdFilhos);
		System.out.println("Altura: "+ altura);
		System.out.println("Pet: " + temPet);
	
	}

}
