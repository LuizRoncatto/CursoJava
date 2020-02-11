package classe.oo.heranca.Desafio;

class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velAtual;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}


	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}


	public void acelerar() {
		if(velAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		}else {
			velAtual += getDelta();
		}
			
		
	}

	public void frear() {

		if (velAtual >= delta) {

			velAtual -= delta;
		} else {
			velAtual = 0;
			System.out.println("carro esta parado");
		}
	}

}
