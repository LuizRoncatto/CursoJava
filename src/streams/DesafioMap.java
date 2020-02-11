package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		Consumer<Integer> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2 ,3 ,4,5,6,7,8,9);
		
		/*
		 * 1. Número para string binária....6 => "110"
		 * 2. Inverter String ... "110" => "011"
		 * 3. Converter de volta para inteiro => "011"=> 3
		 * 
		 * Integer.
		 */
		
		UnaryOperator<String> inverso = n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> decimal = n -> Integer.parseInt(n, 2);
		
		
		nums.stream().map(Integer::toBinaryString).map(inverso).map(decimal).forEach(print);;
	}
	
}
