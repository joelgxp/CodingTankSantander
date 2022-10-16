package aula03;

import java.util.Scanner;

public class Exercicio01 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		mostrar();
		sc.close();

	}

	public static String nomeFuncionario() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o Nome do funcionário: ");
		String nomeFuncionario = sc.nextLine();

		sc.close();

		return nomeFuncionario;
	}

	public static float salarioMensal() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário mensal: ");
		float salarioMensal = sc.nextFloat();

		sc.close();

		return salarioMensal;
	}

	public static float calcDescINSS() {

		float calc = salarioMensal();
		float descINSS = 0;

		if (calc >= 0 && calc <= 1212.00) { // 0 até 1212.00 -> 7,5%
			descINSS = calc * 0.075f;
			// System.out.println("1000");

		} else if (calc >= 1212.01 && calc <= 2427.35) { // 1212.01 até 2427,35 -> 9%
			descINSS = calc * 0.09f;
			// System.out.println("2000");

		} else if (calc >= 2427.36 && calc <= 3641.03) { // 2427,36 até 3641,03 -> 12%
			descINSS = calc * 0.12f;
			// System.out.println("3000");

		} else if (calc >= 3641.04 && calc <= 7087.22) { // 3641,04 até 7087,22 -> 14%
			descINSS = calc * 0.14f;
			// System.out.println("4000");

		} else { // acima de 7087,22 deve ser descontado o teto de 900 reais
			descINSS = calc - 900;
		}
		return descINSS; // descINSS guardou a variavel calculada
	}

	public static float salarioBrutoAnual() {
		float salarioMes = salarioMensal();
		float salarioTotal = (salarioMes * 13) + (salarioMes / 3);
		return salarioTotal;
	}

	public static float inssAnual() {
		float inssMes = calcDescINSS();
		float inssTotal = (inssMes * 13) + (inssMes / 3);
		return inssTotal;
	}

	public static void mostrar() {
		String nomeFuncionario = nomeFuncionario();
		float salarioBrutoAnual = salarioBrutoAnual();
		float inssMes = calcDescINSS();
		float descAnualINSS = (inssMes * 13) + (inssMes / 3);
		float liquidoAnual = salarioBrutoAnual - descAnualINSS;

		System.out.println("****************************************");
		System.out.println("Nome do funcionário: " + nomeFuncionario);
		System.out.println("Salário anual bruto:  " + salarioBrutoAnual);
		System.out.println("Total anual de INSS descontado:  " + descAnualINSS);
		System.out.println("Salário líquido anual:  " + liquidoAnual);
	}

}
