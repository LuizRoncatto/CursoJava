package classe.colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<String>();
		
		lista.add("Ana");
		lista.add("Pedro");
		lista.add("Luca");
		lista.add("Carlos");
		
		for(String candidato : lista) {
			System.out.println(candidato);
		}
		
	}

}
