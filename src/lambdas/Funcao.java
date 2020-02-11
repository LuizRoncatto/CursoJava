package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> paraOuImpar = numero -> numero % 2 == 0 ? "PAR" : "IMPAR";

		System.out.println(paraOuImpar.apply(2));

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + " !!!!";

		Function<String, String> duvida = valor -> valor + " ???";

		String resultadoFinal1 = paraOuImpar.andThen(oResultadoE).andThen(empolgado).apply(2);

		String resultadoFinal2 = paraOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);

		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);

	}

}
