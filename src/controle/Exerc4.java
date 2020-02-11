package controle;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		int i = num -1;
		
		for(; i > 1; i --) {
			
			if (num % i == 0) {
				break;
			
			}
			
		}
		if(i>1) {
			System.out.println("não");
		}else {
			System.out.println("é");
		}
			
		
		System.out.println("FIm");
		entrada.close();
	}

}
