


package aula01;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com dois números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println();
		
		if (a > b)
			System.out.println("Ordem crescente: " + b + ", " + a);
		else
			System.out.println("Ordem crescente: " + a + ", " + b);
		
		sc.close();
			
	}

}