package classe.classe;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Joao", 64.0);
		
		Comida c1 = new Comida("Feijao", 0.3);
		Comida c2 = new Comida("Arroz", 0.4);
		
		p1.imprimirPeso();
		p1.Comer(c1);
		p1.imprimirPeso();
		
		p1.Comer(c2);
	}

}
