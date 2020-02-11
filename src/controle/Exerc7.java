
//Soma os numeros digitados e só sai do loop quando o numero digitado for 0

package controle;

import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		int soma = 0;
		while(num > 0) {
			
			soma = soma + num;
			System.out.println(soma);
			num = entrada.nextInt();
			
			
		}
		
		
		entrada.close();
	}

}
