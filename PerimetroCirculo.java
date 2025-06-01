package lista01;

import java.util.Scanner;

public class PerimetroCirculo {
	
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Raio do Seu Círculo: ");
		double raio = sc.nextFloat();
		double perimetro = 2 * Math.PI * raio;
		System.out.println("O Perimetro do Circulo: "+perimetro);
		
		sc.close();
		
	}
	

}
