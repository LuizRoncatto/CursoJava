package classe.oo.heranca.teste;

import classe.oo.heranca.Desafio.Civic;
import classe.oo.heranca.Desafio.Ferrari;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Ferrari f1 = new Ferrari(400);
		Civic c1 = new Civic();
		
		f1.velAtual = 40;
		c1.velAtual = 10;
		
		System.out.println(f1.velAtual);
		System.out.println(c1.velAtual);
		
		f1.acelerar();
		System.out.println(f1.velAtual);

//		c1.acelerar();
		f1.acelerar();
		System.out.println(f1.velAtual);

		f1.acelerar();
		System.out.println(f1.velAtual);
		
		System.out.println(f1.velAtual);
//		System.out.println(c1.velAtual);
		
//		f1.frear();
		
		System.out.println(f1.velAtual);
//		System.out.println(c1.velAtual);
		
		f1.ligarTurbo();
		System.out.println(f1.velAtual);
		
		f1.ligarAr();
		System.out.println(f1.velAtual);
		
		System.out.println(f1.velocidadeDoAr());
	}

}
