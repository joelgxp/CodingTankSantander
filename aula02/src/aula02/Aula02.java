package aula02;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cod = 0;
		do {
			System.out.println("qual o cargo: ");
			System.out.println("1 - tecnico: ");
			System.out.println("2 - gerente: ");
			System.out.println("3 - outros: ");
			cod = scan.nextInt();
		} while (cod < 1 || cod > 3);

		System.out.println("Qual salário: ");
		float salario = scan.nextFloat();
		if (cod == 1) {
			salario *= 1.5;
		} else if (cod == 2) {
			salario *= 1.3;
		} else if (cod == 3) {
			salario *= 1.2;
		}
		System.out.println("O salario é: " + salario);

		scan.close();
	}

}


