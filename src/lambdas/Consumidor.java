package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome );
		
		Produto prod = new Produto("Caneta", 2, 0.1);
		
		imprimir.accept(prod);
		
		Produto prod2 = new Produto("Bola", 3, 0.1);
		Produto prod3 = new Produto("Notebook", 3000, 0.1);
		Produto prod4 = new Produto("Caderno", 10, 0.1);
		Produto prod5 = new Produto("Borracha", 5, 0.1);
		
		List<Produto> produtos = Arrays.asList(prod, prod2, prod3, prod4, prod5); 
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		
		produtos.forEach(System.out::println);
	}
}
