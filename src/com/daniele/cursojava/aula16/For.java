package src.com.daniele.cursojava.aula16;

public class For {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor de: " + i);
		}
		for (int i = 5; i >= 0; i--) {
			System.out.println("i tem valor de: " + i);
		}
		for (int i=0, j=10; i<j ; i++, j--) {
			System.out.println("i = " + i + "; j= " +j);
		}
		//partes ausentes
		int count = 0;
		
		for( ; count < 10 ; ) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		int soma = 0;
		for (int i=1; i<5; soma+= i++);		 
			System.out.println("O valor da soma é: " + soma);
			
		//sem {}
		for (int i = 0; i < 5; i++) 
			System.out.println("i tem valor de: " + i);			
	}		
}
