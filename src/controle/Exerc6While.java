//jogo de adivinhação feito com While

package controle;

import java.util.Scanner;

public class Exerc6While {
	public static void main(String[] args) {

		int numcorreto = 11;
		int tentativas = 0;
		System.out.println("Vamos jogar o jogo da Adivinhação,\n "
				+ "tente advinhar em qual numero estou pensando de 0 a 100!");
		Scanner entrada = new Scanner(System.in);

		int num = entrada.nextInt();
		while (tentativas < 9) {

			if (num < 0 || num > 100) {
				tentativas++;
				System.out.println("Número invalido, você perdeu uma chance!");
				num = entrada.nextInt();
				continue;
			}

			if (num == numcorreto) {
				System.out.println("Voce acertou");
				break;
			}

			if (num > numcorreto) {
				System.out.println("O número digitado é maior que o correto!");
				num = entrada.nextInt();

			}

			if (num < numcorreto) {
				System.out.println("O número digitado é menor que o correto!");
				num = entrada.nextInt();
			}

			tentativas++;
			if (tentativas == 9) {
				System.out.println("Voce perdeu!");
			}
		}

		System.out.println("----FIM----");
		entrada.close();
	}

}
