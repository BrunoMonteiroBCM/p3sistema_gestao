package sistema_gestao;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int opcao;

		System.out.printf("Digite seu nome: ");
		nome = entrada.next();

		// System.out.printf("Seu nome é " + nome + "\n");

		/*
		 * System.out.printf("Digite seu sobrenome: "); sobrenome = entrada.next();
		 * 
		 * System.out.printf("Digite seu código: "); id = entrada.nextInt();
		 */

		System.out.println("Bem-vindo " + nome);
		System.out.println("Escolha dentre as opções abaixo a que melhor se encaixa com você:");
		System.out.println(
				"\nAluno de: \n1-Graduação/Mestrado/Doutorado/Pesquisador\n2-Professor\n0-Administrador do Sistema\n");
		opcao = entrada.nextInt();

		if (opcao == 1) {
			System.out.println("\nSeja bem-vindo!.\n Digite o número da opção de alocação\n");
			System.out.println("\n1-Alocar recursos para APRESENTAÇÕES\n");
			int alunoalocar = entrada.nextInt();
			System.out.println("\nEm processo de alocação...\n");
			System.out.println("\nALOCADO!");
			System.out.printf("\nRecurso APRESENTAÇÕES alocado a %s\n", nome);
			System.out.printf("\nCONCLUÍDO!\n");
		} else if (opcao == 2) {
			System.out.println("\nBem vindo ao acesso de Professor.\n Digite o número da opção de alocação\n");
			System.out.println(
					"\n1-Alocar recursos para Aula tradicionais(Salas de aula climatizadas com quadro negro e branco disponíveis. \nFavor pegar giz ou piloto na secretaria. \nAtentar as instruções que encontram-se na sala.\n2-APRESENTAÇÕES (data show para fazer apresentação de slides)\n3-Laboratórios(computadores disponíveis para os alunos estudarem e praticarem a matéria\n");
			int alunoalocar = entrada.nextInt();
			if (alunoalocar != 1 && alunoalocar != 2 && alunoalocar != 3)
				System.out.println("Essa opção não existe");
			System.out.println("\nEm processo de alocação...\n");
			System.out.println("\nALOCADO!");
			System.out.printf("\nRecurso APRESENTAÇÕES alocado a %s\n", nome);
			System.out.printf("\nCONCLUÍDO!\n");
		} else if (opcao == 0) {
			System.out.println("\nBem vindo ao acesso de Administrador do Sistema.\nO que você deseja?");
		} else
			System.out.println("A opção digitada está errada. Digite um número de 1 a 6");

	}
}