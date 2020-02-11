//VERIFICADOR DE NUMERO PRIMO

package controle;

import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		int num = entrada.nextInt();
		int i = num -1;
		for (; i > 1; i--) {

			if (num % i == 0) {
				contador++;
				break;

			}

		}switch (contador) {
		case 0:
			System.out.println("primo");
			break;

		default:
			System.out.println("não");
			break;
		}

		entrada.close();
	}

}
