package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num 2
		//Diga qual a operação - + - * / %
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite a operação que deseja: + - * / %");
		String operacao = entrada.next();
		
		int resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;		
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("O resultado de %d  %s  %d  é %d", num1 , operacao, num2, resultado);
				
				
		
		entrada.close();
	}

}
