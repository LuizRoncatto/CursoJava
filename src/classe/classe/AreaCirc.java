package classe.classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;
	
	 AreaCirc(double raio) {
		 
		 this.raio = raio;
	}

	 
	 double area() {
		 return raio * raio * PI;
	 }
}
