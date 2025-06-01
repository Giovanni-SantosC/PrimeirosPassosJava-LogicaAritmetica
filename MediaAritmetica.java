package lista01;

import java.util.Scanner;

public class MediaAritmetica {
	
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro valor da media: ");
		int numero01 = sc.nextInt();
		System.out.println("Digite o Segundo valor da media: ");
		int numero02 = sc.nextInt();
		System.out.println("Digite o Terceiro valor da media: ");
		int numero03 = sc.nextInt();
		int media = (numero01 + numero02 + numero03)/3;
		System.out.println("A media desses valores são: "+media);
		
		sc.close();
	}

}
