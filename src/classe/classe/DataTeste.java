package classe.classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		
		
		Data d2 = new Data(07, 05, 2000);
		
		Data d3 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}

}
