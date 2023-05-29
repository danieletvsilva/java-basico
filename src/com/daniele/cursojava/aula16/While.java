package src.com.daniele.cursojava.aula16;

public class While {
	//While- Comando avalia uma expressão e caso vdd executa o bloco 
	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		System.out.println(i);	
	
		//Do While- Faça enquanto for verdadeiro
	
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while (i < 15);
		
	System.out.println(i);	
}
}