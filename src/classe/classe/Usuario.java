package classe.classe;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(nome);
		boolean emailIgual = outro.email.equals(email);
		
		return nomeIgual && emailIgual;
		
	}

}
