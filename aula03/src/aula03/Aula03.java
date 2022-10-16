package aula03;

import java.util.Scanner;

public class Aula03 {
	public static void main(String[] args) {
//		exemploIfTernario();
//		quadrante();
//		numeroImpar();
//		castigo();
		exemploFor();
	}

	public static void exemploIfTernario() {
		int x = 2;

		if (x < 2) {
			System.out.println("x é menor que 2");
		} else {
			System.out.println("x é maior que 2");
		}

		int idade = 21;
		boolean maiorIdade = idade > 17 ? true : false;

		System.out.println(maiorIdade);
	}

	public static void quadrante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a coordenada X");
		float x = sc.nextFloat();
		System.out.println("Informe a coordenada Y");
		float y = sc.nextFloat();

		if (x > 0 && y > 0) {
			System.out.println("Está no quadrante B");
		} else if (x > 0 && y < 0) {
			System.out.println("Está no quadrante C");
		} else if (x < 0 && y > 0) {
			System.out.println("Está no quadrante A");
		} else if (x < 0 && y < 0) {
			System.out.println("Está no quadrante D");
		} else {
			System.out.println("Está sobre 1 dos eixos");
		}

		sc.close();
	}

	public static void numeroImpar() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero impar.");
		int numero = sc.nextInt();
		while (numero % 2 != 0) {
			System.out.println("Você digitou um numero par, digite um par.");
			numero = sc.nextInt();
		}
		System.out.println("Parabens, Você digitou um numero Impar.");
		sc.close();
	}

	public static void castigo() {
		int i = 0;
		while (i++ < 100) {
			System.out.printf("Seja bem vindo, pela: %d vez!", i);
		}
	}

	public static void exemploFor() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i + 1);
		}
		System.out.printf("\n");
		for (int i = 10; i > 0; i--) {
			System.out.printf("%d ", i);
		}
		System.out.printf("\n");
		for (int i = 10; i --> 0; ) {
			System.out.printf("%d ", i + 1);
		}
		System.out.printf("\n");
		for (int i = 0; i ++< 10; ) {
			System.out.printf("%d ", i);
		}
	}
}