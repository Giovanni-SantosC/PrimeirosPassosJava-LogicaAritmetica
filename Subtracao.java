package lista01;

import java.util.Scanner;

public class Subtracao {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Seu Primeiro Numero : ");
		int numero01 = sc.nextInt();
		System.out.println("Digite o Seu Segundo Numero : ");
		int numero02 = sc.nextInt();
		int resultado = numero01 - numero02;
		System.out.println("A Subtraçâo Dos Dois Numeros é : "+resultado);
		
		sc.close();
		
	} 
	

}
