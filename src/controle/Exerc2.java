//VERIFICADOR DE ANO BISSEXTO, PRIMEIRO SE RECEBE O NUMERO DE DIAS DO MẼS E FAZ O CALCULO

package controle;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o total de dias no mẽs de fevereiro");
		int dias = entrada.nextInt();
		
		if(dias != 29 && dias >= 0 && dias <= 28) {
			System.out.println("O ano não é bissexto");
		}else {
			System.out.println("O ano é bissexto");
		}
		
		System.out.println("Fim!");
		entrada.close();
	}

}
