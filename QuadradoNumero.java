package lista01;

import java.util.Scanner;

public class QuadradoNumero {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor :");
		int numero01 = sc.nextInt();
		int quadrado = numero01 * numero01;
	    System.out.println("Seu Numero ao quadrado e : "+quadrado);
	    
	    sc.close();
		
	}

}
