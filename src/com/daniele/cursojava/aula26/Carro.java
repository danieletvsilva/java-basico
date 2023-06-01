package src.com.daniele.cursojava.aula26;

public class Carro {	
	//atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;		
	
	//métodos
	
	//sem retorno
	void exibirAutonomia() {		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");		
	}
	
	//com retorno
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	//com parâmetro
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
