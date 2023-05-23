package com.daniele.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = leitura.nextLine(); //Lê a linha inteira
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = leitura.next(); // Lê só uma string
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = leitura.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Qual a sua altura?  ");
		double altura = leitura.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
				
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e bichos de estimação: ");
		String primeiroNome = leitura.next();
		int idade = leitura.nextInt();
		byte qtdFilhos = leitura.nextByte();
		float altura = leitura.nextFloat();
		boolean temPet = leitura.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Filhos: " + qtdFilhos);
		System.out.println("Altura: "+ altura);
		System.out.println("Pet: " + temPet);	
	}
}
