package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());

		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 123.34534;
		System.out.println(d);
		

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);

		
		Character c = '#';
		System.out.println(c.toString());
		
		
		
		entrada.close();
	}

}
