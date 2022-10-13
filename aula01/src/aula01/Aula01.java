package aula01;

import java.time.LocalDate;
import java.util.Scanner;

class Aula01 {
	
	public static void main (String args[]) {
		String fraseUm = "Bem-vindo, ";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println(fraseUm + nome);
		System.out.println("Agora, digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Seja bem-vindo, "+nome + " " +sobrenome);
		
		System.out.println("Digite o seu ano de nascimento: ");
		int ano = entrada.nextInt();
		int anoAtual = LocalDate.now().getYear();
		int idade = anoAtual - ano;
		System.out.println("Sua idade: "+idade);
		entrada.close();
	}

}
