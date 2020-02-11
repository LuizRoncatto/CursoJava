
//jogo de adivinhação feito com FOR

package controle;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		int numcorreto = 4;
		Scanner entrada = new Scanner(System.in);

		int num = entrada.nextInt();

		for (int tentativas = 10; tentativas >= 1;tentativas--) {
			if (num <= 100 && num > 0) {
				if (num != numcorreto && num < numcorreto) {
					
					System.out.println("Voce errou");
					System.out.println("O número correto é maior que o digitado");
					System.out.println("Voce tem " + tentativas + " chances");
					num = entrada.nextInt();

				} else if (num != numcorreto && num > numcorreto) {
					
					System.out.println("Você errou");
					System.out.println("O numero correto é menor que o numero digitado");
					System.out.println("Voce tem " + tentativas + " chances");
					num = entrada.nextInt();
				}else if(num == numcorreto){
					System.out.println("Voce acertou");
					break;
				}else {
					System.out.println("Numero invalido");

				}
				
				
			}
		}
		System.out.println("------FIM DE JOGO------");
		entrada.close();
	}

}
