// Digita 10 números e retorna qual o maior numero


package controle;

import java.util.Scanner;

public class Exerc9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int num = entrada.nextInt();
		int nummaior = 0;
		
		while (contador < 9) {
			
			if (num >= nummaior) {
				nummaior = num;
			}
			
			contador ++;
			num = entrada.nextInt();
		}
		
		System.out.println("O maior número digitado foi " + nummaior);
		System.out.println("FIM!");
		entrada.close();
	}

}
