package classe.classe;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void Comer(Comida comida) {

		this.peso += comida.peso;
	}
	
	void imprimirPeso() {
		System.out.println("O PESO ATUAL EH " + this.peso);
	}
}