package sistema_gestao;

import java.util.Scanner;

public class recursostest {

	public static void main(String[] args) { // TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		recursos recursos = new recursos();

		System.out.println("Insira o respons�vel pela solicita��o de empr�stimo\n");
		int codresponsavel = input.nextInt();

		switch (codresponsavel) {
		case 1:
			if (codresponsavel == 0) {
				System.out.println("Voc� � o Administrador do Sistema");
			}
			break;
		case 2:
			if (codresponsavel == 1) {
				System.out.println("Voc� � pesquisador!\n");
			}
			break;

		}

		System.out.println("Insira a data da solicita��o do emprestimo\n");
		String datainicio = input.next();
		System.out.println("Insira a hora de in�cio do emprestimo\n");
		String horainicio = input.next();
		System.out.println("Insira a data da devolu��o do emprestimo\n");
		String datafim = input.next();
		System.out.println("Insira a hora da devolu��o do emprestimo\n");
		String horafim = input.next();

		// System.out.println("Data inicio:" + codresponsavel);
		System.out.println("Data inicio:" + datainicio);
		System.out.println("Hora inicio:" + horainicio);
		System.out.println("Data de devolu��o:" + datafim);
		System.out.println("Hora de devolu��o:" + horafim);

	}

}
