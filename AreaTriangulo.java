
package lista01;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Largura do seu Triangulo : ");
		float largura = sc.nextFloat();
		System.out.println("Digite a Altura do seu Triangulo : ");
		float altura = sc.nextFloat();
		
		float area = largura * altura;
		
		System.out.printf("A Area do Seu Triangulo é : %.2f \n",area);
		
		sc.close();
		
		
	
	}

}
