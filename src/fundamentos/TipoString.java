package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		
		String s = "Boa tarde";
		System.out.println(s.contentEquals("boa tarde"));
		
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Pedro";
		var idade = 23;
		var salario = 1231.54;
		
		System.out.println("Nome: " + nome + " Idade " + idade);
		System.out.printf("Nome é %s e tem %d anos de idade e ganha %.2f", nome, idade,salario);
		
		String frase = String.format("\nNome é %s e tem %d anos de idade e ganha %.2f", nome, idade,salario);
		System.out.println(frase);
		
		
		
	}

}
