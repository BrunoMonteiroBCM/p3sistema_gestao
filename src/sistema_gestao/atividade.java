package sistema_gestao;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int opcao;

		System.out.printf("Digite seu nome: ");
		nome = entrada.next();

		// System.out.printf("Seu nome � " + nome + "\n");

		/*
		 * System.out.printf("Digite seu sobrenome: "); sobrenome = entrada.next();
		 * 
		 * System.out.printf("Digite seu c�digo: "); id = entrada.nextInt();
		 */

		System.out.println("Bem-vindo " + nome);
		System.out.println("Escolha dentre as op��es abaixo a que melhor se encaixa com voc�:");
		System.out.println(
				"\nAluno de: \n1-Gradua��o/Mestrado/Doutorado/Pesquisador\n2-Professor\n0-Administrador do Sistema\n");
		opcao = entrada.nextInt();

		if (opcao == 1) {
			System.out.println("\nSeja bem-vindo!.\n Digite o n�mero da op��o de aloca��o\n");
			System.out.println("\n1-Alocar recursos para APRESENTA��ES\n");
			int alunoalocar = entrada.nextInt();
			System.out.println("\nEm processo de aloca��o...\n");
			System.out.println("\nALOCADO!");
			System.out.printf("\nRecurso APRESENTA��ES alocado a %s\n", nome);
			System.out.printf("\nCONCLU�DO!\n");
		} else if (opcao == 2) {
			System.out.println("\nBem vindo ao acesso de Professor.\n Digite o n�mero da op��o de aloca��o\n");
			System.out.println(
					"\n1-Alocar recursos para Aula tradicionais(Salas de aula climatizadas com quadro negro e branco dispon�veis. \nFavor pegar giz ou piloto na secretaria. \nAtentar as instru��es que encontram-se na sala.\n2-APRESENTA��ES (data show para fazer apresenta��o de slides)\n3-Laborat�rios(computadores dispon�veis para os alunos estudarem e praticarem a mat�ria\n");
			int alunoalocar = entrada.nextInt();
			if (alunoalocar != 1 && alunoalocar != 2 && alunoalocar != 3)
				System.out.println("Essa op��o n�o existe");
			System.out.println("\nEm processo de aloca��o...\n");
			System.out.println("\nALOCADO!");
			System.out.printf("\nRecurso APRESENTA��ES alocado a %s\n", nome);
			System.out.printf("\nCONCLU�DO!\n");
		} else if (opcao == 0) {
			System.out.println("\nBem vindo ao acesso de Administrador do Sistema.\nO que voc� deseja?");
		} else
			System.out.println("A op��o digitada est� errada. Digite um n�mero de 1 a 6");

	}
}