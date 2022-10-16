package aula02;

import java.util.Scanner;

public class Exercicio03 {

	private static float salario;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		setSalario();
		aumentaSalario();
		calculaSalarioLiquido();
		calculaSalario();
		sc.close();
	}
	
	public static void setSalario() {
		System.out.println("Digite seu salário:");
		salario = sc.nextFloat();
	}

	public static void aumentaSalario() {
		int codigo;

		do {
			System.out.println("Digite o código do cargo:");
			System.out.println("1 = Técnico");
			System.out.println("2 = Gerente");
			System.out.println("3 = Demais");
			
			codigo = sc.nextInt();

			switch (codigo) {
			case 1:
				salario *= 1.5f;
				break;
			case 2:
				salario *= 1.3f;
				break;
			case 3:
				salario *= 1.2f;
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (codigo < 1 || codigo > 3);

		System.out.printf("O valor do salário reajustado é: R$ %.2f\n", salario);
	}

	public static float calculaSalario() {
		float mediaAnual = (salario * 13) / 12;
		System.out.printf("A sua média salarial é: R$ %.2f\n", mediaAnual);
		return mediaAnual;
	}

	public static float calcularINSS() {
		float aliquotaINSS = 0.075f;
		float inss = salario * aliquotaINSS;

		System.out.printf("O valor do INSS é: R$ %.2f\n", inss);

		return inss;
	}

	public static float calcularTercoFerias() {
		float percentual = 0.33f;
		float tercoFerias = salario * percentual;

		System.out.printf("O valor do terço férias é: R$ %.2f\n", tercoFerias);

		return tercoFerias;
	}

	public static float calculaSalarioLiquido() {
		float decimoTerceiro = salario;
		float salarioAnual = salario * 12;
		float inss = calcularINSS();
		float tercoFerias = calcularTercoFerias();
		float salarioLiquido = salarioAnual + decimoTerceiro + tercoFerias - inss;

		System.out.printf("O valor do seu salário líquido anual é: R$ %.2f\n", salarioLiquido);
		return salarioLiquido;
	}
}