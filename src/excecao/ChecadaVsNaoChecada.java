package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) throws Exception {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		geraErro2();
		
		System.out.println("Fim :");
	}
	//Não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu o erro #01");
	}
	
	static void geraErro2() throws Exception{
		try {
			throw new Exception("Ocorreu o erro #02");
		} catch (Exception e) {
			System.out.println("que legal");
		}
	}
}
