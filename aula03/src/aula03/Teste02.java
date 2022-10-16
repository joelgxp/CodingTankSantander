package aula03;

import java.util.Scanner;

public class Teste02 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		mostrar();
		//salarioBrutoAnual();
		//calcDescINSS();

	}
	
	public static float salarioMensal() {
		
		//Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário mensal: ");
		float salarioMes = sc.nextFloat();

		//sc.close();

		return salarioMes;
	}
	
	public static float calcDescINSS(float salarioMensal) {
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
		return descINSS;
	}
	
	public static float salarioBrutoAnual(float salarioMes) {
		
		float salarioTotal = (salarioMes * 13) + (salarioMes / 3);
		return salarioTotal;
		
	}
	
	public static float inssAnual(float calcDescINSS) {
		
		float inssTotal = (calcDescINSS * 13) + (calcDescINSS / 3);
		return inssTotal;
		
	}
	
//	O resultado final apresentado ao funcionário deve ter o 
//	salário anual bruto, 
//	total anual de inss descontado e o 
//	salário anual líquido final.
	
	public static void mostrar() {
		float salarioBrutoAnual = salarioBrutoAnual();
		float descAnualINSS = inssAnual();
		float liquidoAnual = salarioBrutoAnual - descAnualINSS;
		
		System.out.printf("Salário anual bruto:  ", salarioBrutoAnual);
		System.out.printf("Total anual de INSS descontado:  ", descAnualINSS);
		System.out.printf("Salário líquido anual:  ", liquidoAnual);
		
	}

}
