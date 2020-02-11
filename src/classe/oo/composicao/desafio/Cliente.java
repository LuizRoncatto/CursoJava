package classe.oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarListaDeCompra (Compra compra) {
		this.compras.add(compra);
	}
	
	
	double obterValorTotal(){
		double total = 0;
		
		for(Compra compra : this.compras) {
			total += compra.obterValorTotal(); 
		}
		
		return total;
	}

}
