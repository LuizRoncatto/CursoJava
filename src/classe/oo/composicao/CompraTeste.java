package classe.oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.cliente = "Joao";
		
		c1.adicionarItem(new Item("Canete", 2, 2.5));
		c1.itens.add(new Item("Borracha", 1, 1.5));
		c1.itens.add(new Item("Caderno", 1, 12.67));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
		
		double full = c1.itens.get(1).compra.itens.get(1).compra.getValorTotal();
		System.out.println(full);
	}

}
