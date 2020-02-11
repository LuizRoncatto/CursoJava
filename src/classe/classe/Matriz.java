package classe.classe;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o total de alunos: ");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Digite quantas notas cada aluno possui: ");
		int qtdeNotas = entrada.nextInt();

		int[][] notas = new int[qtdeAlunos][qtdeNotas];

		int mediaDaTurma = 0;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1));
				notas[i][j] = entrada.nextInt();
				mediaDaTurma += notas[i][j];
			}
		}
		System.out.println("A media da turma eh : " + (mediaDaTurma / (qtdeAlunos * qtdeNotas)));

		entrada.close();
	}

}
