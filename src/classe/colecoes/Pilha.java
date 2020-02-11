package classe.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno principe");
		livros.push("TRES");
		livros.push("DOIS");
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		
//		System.out.println(livros.peek());
//		
//		System.out.println(livros.pop());
//		System.out.println(livros.poll());
//		System.out.println(livros.poll());
//		System.out.println(livros.poll());
//		System.out.println(livros.pop());

		
		livros.size();
		livros.clear();
		livros.contains("DOIS");
		livros.isEmpty();
		

	}

}
