package sistema_gestao;

import java.util.Scanner;

public class usuario {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public String getnome(){
		return nome;
	}
	public void setnome(String n) {
		this.nome = n;
	}
	public String getsobrenome(){
		return sobrenome;
	}
	public void setsobrenome(String sn) {
		this.nome = sn;
	}
	public int getidade() {
		return idade;
	}
	public int setidade(int age) {
		return this.idade = age;
	}

}