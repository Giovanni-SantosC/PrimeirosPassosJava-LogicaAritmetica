package lista01;

import java.util.Scanner;

public class RestoDivisao {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu Primeiro Numero : ");
		int numero01 = sc.nextInt();
		System.out.println("Digite seu Segundo Numero : ");
		int numero02 = sc.nextInt();
		int resultado = numero01 % numero02;
		System.out.println("O Resto Dessa Divisão é : "+resultado);
		
		sc.close();
	}
}
