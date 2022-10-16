package aula03;

import java.util.Scanner;

public class TarefaSalario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe do nome do funcionário: ");
		String nomeFuncionario = sc.nextLine();
		System.out.print("Informe o salário mensal: ");
		float salarioMensal = sc.nextFloat();
		sc.close();

		float calc = salarioMensal;
		float descINSS;

		if (calc >= 0 && calc <= 1212.00) { // 0 até 1212.00 -> 7,5%
			descINSS = calc * 0.075f;

		} else if (calc >= 1212.01 && calc <= 2427.35) { // 1212.01 até 2427,35 -> 9%
			descINSS = calc * 0.09f;

		} else if (calc >= 2427.36 && calc <= 3641.03) { // 2427,36 até 3641,03 -> 12%
			descINSS = calc * 0.12f;

		} else if (calc >= 3641.04 && calc <= 7087.22) { // 3641,04 até 7087,22 -> 14%
			descINSS = calc * 0.14f;

		} else { // acima de 7087,22 deve ser descontado o teto de 900 reais
			descINSS = 900f;
		}


		float salarioBrutoAnual = (salarioMensal * 13) + (salarioMensal / 3);
		float descAnualINSS = (descINSS * 13) + (descINSS / 3);
		float liquidoAnual = salarioBrutoAnual - descAnualINSS;
		
		System.out.println("**********************************************");
		System.out.println("        DEMONSTRATIVO DE PAGAMENTO        ");
		System.out.println("");
		System.out.printf("Nome: %s %n", nomeFuncionario.toUpperCase());
		System.out.printf("Salário anual bruto: R$ %.2f %n", salarioBrutoAnual);
		System.out.printf("Total anual de INSS descontado: R$ %.2f %n", descAnualINSS);
		System.out.printf("Salário líquido anual: R$ %.2f %n", liquidoAnual);
		System.out.println("*********************************************");

	}
}
