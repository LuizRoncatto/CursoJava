package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		String faixa = "vermelha";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");

		case "marrom":
			System.out.println("Sei o blever");
		case "roxa":
			System.out.println("Sei o x");
		case "verde":
			System.out.println("Sei o y");
		case "vermelha":
			System.out.println("Sei o z");
			break;
		default:
			System.out.println("Sei de nada!");
		}
	}

}
