package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String frase = entrada.nextLine();
		while(!frase.equalsIgnoreCase("sair")) {
			System.out.println("Digite outra frase: ");
			frase = entrada.nextLine();
		}
		
		
		entrada.close();
	}

}
