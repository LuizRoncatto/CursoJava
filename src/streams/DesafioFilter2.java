package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto(2500.00, "Notebook", 0.32, true);
		Produto p2 = new Produto(3000.00, "Ultrabook", 0.40, true);
		Produto p3 = new Produto(150.00, "Chinelo", 0.32, false);
		Produto p4 = new Produto(1200.00, "Celular", 0.50, true);
		Produto p5 = new Produto(800.00, "Tenis", 0.35, true);
		Produto p6 = new Produto(1000.00, "Vestido", 0.22, false);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);

		Predicate<Produto> superDesconto = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = p -> p.freteGratis;
		Predicate<Produto> relevante = p -> p.preco >= 500;

		Function<Produto, String> promocao = p -> "Aproveite " + p.nome + " por R$ " + p.preco;
		
		
		produtos.stream()
		.filter(relevante)
		.filter(freteGratis)
		.filter(superDesconto)
		.map(promocao)
		.forEach(System.out::println);
		
	}

}
