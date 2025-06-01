package lista01;

import java.util.Scanner;

public class ConvesorTemperatura {
	
	 public static void main(String[]args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite o Grau Celsius Para ser Convertido : ");
		 double celsius = sc.nextDouble();
		 double celsiusParaFahrenheit = (celsius * 1.8) + 32.0;
		 System.out.println("Seu Graus Celsius Convertido em Fahrenheit é : " + celsiusParaFahrenheit);
		 
		 sc.close();
		 
		 
		 
	 }

}
