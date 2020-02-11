package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura do triangulo:\n");
		
		double altura  = entrada.nextDouble();
		
		System.out.println("Entre com o comprimento da base \n");
		
		double base = entrada.nextDouble();
		
		double area = (altura * base)/2;
		
		System.out.println("A area do triangulo é" + area);
		
		entrada.close();
		
	}

}
