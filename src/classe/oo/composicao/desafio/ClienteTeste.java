package classe.oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Luiz");
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Caneta", 5, 3);
		compra1.adicionarItem(new Produto("notebook", 100) , 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 50), 2);
		
		c1.adicionarListaDeCompra(compra1);
		c1.adicionarListaDeCompra(compra2);
		c1.adicionarListaDeCompra(compra1);
		System.out.println(c1.obterValorTotal());
	}

}
