package fundamentos;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		double num = entrada.nextDouble();
		
		double potencia = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("O quadrado do numero %.2f é %.2f,\n e o cubo é %.2f", num, potencia, cubo);
		
		
		entrada.close();
	}

}
