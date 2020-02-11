package classe.classe;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("qual sera o total de notas?");
		int totalNotas = entrada.nextInt();
		
		
		double[] notas = new double [totalNotas]; 
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		
		int media = 0;
		
		for (double nota : notas) {
			
			media += nota;
		}
		
		System.out.println("A media do aluno eh: " + (media / notas.length));
		
		entrada.close();
	}

}
