package controle;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10 && num % 2 ==0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
		
		System.out.println("Fim!");
		entrada.close();
	}

}
