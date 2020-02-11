package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui");
		System.out.println("Usando foreach ...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nUsando Iterator ...");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Stream<String> st = aprovados.stream();
		System.out.println("\nUsando Stream ...");
		st.forEach(System.out::println);

	}
}
