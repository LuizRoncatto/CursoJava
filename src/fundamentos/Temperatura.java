package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final int CONST1 = 32;
		final double CONST2 = (5/9.0);
		
		double firen = 86;
		double celsius = (firen - CONST1) * (CONST2);
		System.out.println("O RESULTADO É " + celsius + "ºC");
		
	}

}
