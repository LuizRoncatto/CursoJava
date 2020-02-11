package classe.oo.heranca.teste;

import classe.oo.heranca.Heroi;
import classe.oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro m1 = new Monstro();
		m1.x = 10;
		m1.y = 10;

		Heroi heroi = new Heroi(10, 11);
		

		System.out.println(m1.vida);
		System.out.println(heroi.vida);

		m1.atacar(heroi);
		heroi.atacar(m1);
		System.out.println("Monstro tem => " + m1.vida + " pontos de vida");
		System.out.println("Monstro tem => " + heroi.vida + " pontos de vida");
		
		m1.atacar(heroi);
		heroi.atacar(m1);
	
	
		
		System.out.println("Monstro tem => " + m1.vida + " pontos de vida");
		System.out.println("Monstro tem => " + heroi.vida + " pontos de vida");
		
	}

}
