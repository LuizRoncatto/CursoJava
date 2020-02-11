//VERIFICADOR DE SITUAÇÃO DO ALUNO COM BASE NA MÉDIA

package controle;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira Nota: ");
		double n1 = entrada.nextDouble();
		if(n1 <0 && n1 >10) {
			System.out.println("Nota");
		}
		System.out.println("Digite a segunda Nota: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2)/2;
		
		if(media >= 0 && media <=10) {
			if(media >=7) {
				System.out.println("Aprovado");
			}else if (media <7 && media >=4) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Reprovado");
			}
		}
		
		
		System.out.println("Fim");
		entrada.close();
	}

}
