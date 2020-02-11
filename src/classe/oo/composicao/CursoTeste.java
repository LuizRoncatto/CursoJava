package classe.oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("Maria");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("ReactJS");
		Curso curso3 = new Curso("JavaWeb");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);

		aluno2.adicionarCurso(curso3);
		aluno1.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome + "e meu nome eh: " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.getCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
