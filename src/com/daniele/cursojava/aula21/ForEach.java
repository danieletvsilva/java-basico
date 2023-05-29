package src.com.daniele.cursojava.aula21;
import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		/*int[] notas = new int [10];
		
		Random random = new Random();
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for (int nota : notas) {
			System.out.print(nota + " ");
		}*/

		
		//ex2
		System.out.println("Exemplo com arrays multidimensionais ");
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0]= 10;
		notasAlunos[0][1]= 7;
		notasAlunos[0][2]= 9;
		notasAlunos[0][3]= 9.5;
		
		notasAlunos[1][0]= 10;
		notasAlunos[1][1]= 6;
		notasAlunos[1][2]= 10;
		notasAlunos[1][3]= 8;
		
		notasAlunos[2][0]= 9;
		notasAlunos[2][1]= 10;
		notasAlunos[2][2]= 8;
		notasAlunos[2][3]= 10;
	
		// Loop externo que percorre cada linha (array de notas de um aluno) na matriz "notasAlunos"
		for (double[] notasAluno : notasAlunos) {
		    // Loop interno que percorre cada elemento (nota) na linha atual (array de notas de um aluno)
		    for (double nota : notasAluno) {
		        // Imprime a nota seguida de um espaço na mesma linha
		        System.out.print(nota + " ");
		    }
		    // Após imprimir todas as notas da linha atual, imprime uma quebra de linha
		    System.out.println();
		}

	}
}
