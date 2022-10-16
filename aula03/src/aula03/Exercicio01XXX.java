// package aula03.ajudaJoel;

package aula03;

import java.util.Scanner;


public class Exercicio01 {
	
	static float salarioMes; // Criei essa variável estática para toda a classe
	
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

		float calc = salarioMes; // Modifiquei aqui para receber a variável estática
		float descINSS;

		if (calc >= 0 && calc <= 1212.00) { 
			descINSS = calc * 0.075f;
			
		} else if (calc >= 1212.01 && calc <= 2427.35) { 
			descINSS = calc * 0.09f;
			
		} else if (calc >= 2427.36 && calc <= 3641.03) { 
			descINSS = calc * 0.12f;
			
		} else if (calc >= 3641.04 && calc <= 7087.22) { 
			descINSS = calc * 0.14f;
			
		} else { 
			descINSS = 900f;
		}
		return descINSS; 
	}

	public static float salarioBrutoAnual() {
		salarioMes = salarioMensal(); // A variável estática receberá os dados do te
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
		
		System.out.println("Salário anual bruto:  " + salarioBrutoAnual);
		System.out.println("Total anual de INSS descontado:  " + descAnualINSS);
		System.out.println("Salário líquido anual:  " + liquidoAnual);
	}

}