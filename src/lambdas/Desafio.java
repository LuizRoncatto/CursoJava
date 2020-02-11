package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		/* 
		 * 1.A partir do produto caluclar o preco real (com desconto)
		 * 2. Imposto Municipa: >- 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (1000/ < 3000(50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 * 
		 */
		
			Function<Produto, Double> precoComDesconto = p -> p.preco * ( 1. - p.desconto);
			
			UnaryOperator<Double> calcImposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
			
			UnaryOperator<Double> calcFrete = preco -> preco >= 3000 ? preco + 100.00 : preco + 50.00;

			UnaryOperator<Double> arredondamento = preco -> Double.parseDouble(String.format("%.2f", preco));
			
			Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
			
			Produto p1 = new Produto("Ipad", 3235.89, 0.5);
			
			
			
			String precof = precoComDesconto
					.andThen(calcImposto)
					.andThen(calcFrete)
					.andThen(arredondamento)
					.andThen(formatar)
					.apply(p1);
			
			System.out.println(precof);
			
	}
}
