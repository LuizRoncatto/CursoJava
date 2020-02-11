package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		int nota = entrada.nextInt();
		
		String conceito = "";
		

		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5 :
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;

		default:
			System.out.println("Nota Invalida");
			break;
		}

		System.out.println("Conceito é " + conceito);
		entrada.close();
	}

}
