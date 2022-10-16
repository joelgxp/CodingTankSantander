package aula03;

import java.util.Scanner;

public class TarefaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contA;// laco externo
		int contB;// laco interno
		System.out.print("Digite o números linhas: ");
		int linhas = sc.nextInt();

		sc.close();
		for (contA = 1; contA <= linhas; contA++) {

			for (contB = linhas; contB >= contA; contB--)
				System.out.print("*");
				System.out.print("\n");// quebra linha
		}

	}

}
