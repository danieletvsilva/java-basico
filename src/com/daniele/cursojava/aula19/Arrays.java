package src.com.daniele.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 31;
		temperaturas[3] = 33;
		temperaturas[4] = 34.3;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
				
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia "  + (i+1) + " é: " + temperaturas[i] );
		}
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		}

}
