package fundamentos.opearadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media =  7.6;
		String resultadoRecuperacao = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7 ? "Aprovado" : resultadoRecuperacao; 
		System.out.println(resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedio = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedio;
		String resultado2 = temDesconto ? "sim" : "nao";
		
		System.out.println("Tem desconto? "+ resultado2);
	}

}
