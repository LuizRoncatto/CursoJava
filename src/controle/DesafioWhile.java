package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);


		double nota = 0;
		int contador = 0;
		double notaf = 0;
		
			while (nota != -1) {
				System.out.println("digite a nota");
				nota = entrada.nextDouble();
				
				if(nota <= 10 && nota >=0) {
					notaf +=nota;
					contador ++;
				}else if (nota != -1){
					System.out.println("Nota invalida!!!");
				}
			}
		double media = notaf / contador;
		System.out.println("Média é: " + media);
		entrada.close();
	}

}
