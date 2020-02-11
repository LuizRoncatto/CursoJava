package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro salario");
		String sal1 = entrada.next().replace(",", ".");

		System.out.println("Entre com o segundo salario");
		String sal2 = entrada.next().replace(",", ".");
		
		System.out.println("Entre com o terceiro salario");
		String sal3 = entrada.next().replace(",", ".");
		
		
		double s1 = Double.parseDouble(sal1);
		double s2 = Double.parseDouble(sal2);
		double s3 = Double.parseDouble(sal3);
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.printf("A media dos salarios é : %f", media);

		
		
		entrada.close();
	}
}
