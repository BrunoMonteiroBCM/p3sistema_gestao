package sistema_gestao;

import java.util.Scanner;

public class usuariotest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		usuario usuario = new usuario();
		
		System.out.println("Insira seu nome");
		String nome = input.next();
		usuario.setnome(nome);
		System.out.println(usuario.getnome());
		
		System.out.println("Insira seu sobrenome\n");
		String sobrenome = input.next();
		usuario.setsobrenome(sobrenome);
		System.out.println(usuario.getsobrenome());
		
		usuario.setidade(22);
		int idade = input.nextInt();
		System.out.println(usuario.getidade());
	}

}
