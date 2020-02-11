package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> soma = (x, y) -> {return x + y;};

		System.out.println(soma.apply(2.0, 3.0));

		soma = (x, y) -> x * y;
		System.out.println(soma.apply(2.0, 3.0));
		
		BiFunction<Integer, Double, Double> teste = (a, b) -> {return a * b;};
		System.out.println(teste.apply(5, 3.2));
	}

}
