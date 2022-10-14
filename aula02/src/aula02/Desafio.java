package aula02;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um salário: ");
		Double salario = sc.nextDouble();
		Double salarioAnual = ((salario - salario * 0.075) * 13) + (salario / 3);
		System.out.printf("Salário liquido anual : %.2f" , salarioAnual);		
		
		sc.close();
	}

}
