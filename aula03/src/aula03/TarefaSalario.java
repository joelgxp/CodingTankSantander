package aula03;

import java.util.Scanner;

public class TarefaSalario {

	static float salarioMes;

	public static void main(String[] args) {

		mostrar();

	}

	public static float salarioMensal() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário mensal: ");
		salarioMes = sc.nextFloat();

		sc.close();

		return salarioMes;
	}

	public static float calcDescINSS() {

		float calc = salarioMes;
		float descINSS = 0;
		float calc1 = 0;
		float calc2 = 0;
		float calc3 = 0;
		float calc4 = 0;

		if (calc <= 1212.00) {
			calc1 = calc * 0.075f;
			descINSS = calc1;

		} else if (calc >= 1212.01 && calc <= 2427.35) {
			calc1 = 1212.00f * 0.075f;
			calc2 = (calc - 1212.01f) * 0.09f;
			descINSS = calc1 + calc2;

		} else if (calc >= 2427.36 && calc <= 3641.03) {
			calc1 = 1212.00f * 0.075f;
			calc2 = 1215.34f * 0.09f;
			calc3 = (calc - 2427.36f) * 0.12f;
			descINSS = calc1 + calc2 + calc3;

		} else if (calc >= 3641.04 && calc <= 7087.22) {
			calc1 = 1212.00f * 0.075f;
			calc2 = 1215.34f * 0.09f;
			calc3 = 1213.68f * 0.12f;
			calc4 = (calc - 3641.04f) * 0.14f;
			descINSS = calc1 + calc2 + calc3 + calc4;

		} else {
			descINSS = 900f;
		}
		return descINSS;
	}

	public static float salarioBrutoAnual() {
		salarioMes = salarioMensal();
		float salarioTotal = (salarioMes * 13) + (salarioMes / 3);
		return salarioTotal;
	}

	public static float inssAnual() {
		float inssMes = calcDescINSS();
		float inssTotal = (inssMes * 13) + (inssMes / 3);
		return inssTotal;
	}

	public static void mostrar() {
		float salarioBrutoAnual = salarioBrutoAnual();
		float descAnualINSS = inssAnual();
		float liquidoAnual = (salarioBrutoAnual - descAnualINSS);

		System.out.println("**********************************************");
		System.out.println("        DEMONSTRATIVO DE PAGAMENTO        ");
		System.out.println("");
		System.out.printf("Salário anual bruto: R$%.2f%n", salarioBrutoAnual);
		System.out.printf("Total anual de INSS descontado: R$%.2f%n", descAnualINSS);
		System.out.printf("Salário líquido anual: R$%.2f%n", liquidoAnual);
		System.out.println("*********************************************");
	}

}