package fundamentos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de B");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de C");
		int c = entrada.nextInt();
		
		int delta = (int) (Math.pow(b, 2) - (4 * a *c));
		
		int x1 = (int) (-b + (Math.sqrt(delta))) / (2 * a);
		int x2 = (int) (-b - (Math.sqrt(delta))) / (2 * a);
		
		System.out.printf("As raizes dessa equação são: %d e %d ", x1, x2);
		
		
		entrada.close();
	}

}
