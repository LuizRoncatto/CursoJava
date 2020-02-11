package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
	
	public static void main(String[] args) {
		
		Veiculos v1 = new Veiculos("Corsa", true, true);
		Veiculos v2 = new Veiculos("KA", true, false);
		Veiculos v3 = new Veiculos("Celta", true, true);
		Veiculos v4 = new Veiculos("BMW", false, true);

		List<Veiculos> veiculos = Arrays.asList(v1,v2,v3,v4);
		
		Predicate<Veiculos> lavado = v -> v.lavado;
		Predicate<Veiculos> revisado = v -> v.revisado;
		
		Function<Veiculos, String> prontoParaEntrega = v -> "O veiculo " + v.nome + " esta pronto para ser entregue";
		
		veiculos.stream()
		.filter(revisado)
		.filter(lavado)
		.map(prontoParaEntrega)
		.forEach(System.out::println);
	}

}
