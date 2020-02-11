package lambdas;

@FunctionalInterface
public interface Calculo {
	
	//Interface Funcional pode ter somente um unico metodo abstrato

	double executar(double a, double b); 
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
	
}
