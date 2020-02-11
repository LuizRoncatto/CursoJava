package classe.classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 1;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);

		Produto.desconto = 0.50;
		
		double precof1 = p1.precoComDesconto();
		double precof2 = p2.precoComDesconto();
		
		System.out.println(precof1);
		System.out.println(precof2);
		
//		System.out.println("A média é " + media);
	}

}
