package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações de um funcionário
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		float salario = 11_445.44F;
		
		double vendasAcumuladas = 2_993_234_123.01;
		
		boolean estaDeFerias = false;
		
		char status = 'A';
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		System.out.println(numeroDeVoos / 2);
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		
		System.out.println("Status: "+ status);
	}

}
