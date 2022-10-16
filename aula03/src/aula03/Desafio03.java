package aula03;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o X: ");
		int x = sc.nextInt();
		System.out.print("Digite o Y: ");
		int y = sc.nextInt();
		
		if (x<0 && y>0) {
			System.out.println("Quadrante A");
		} else if (x>0 && y>0) {
			System.out.println("Quadrante B");
		} else if (x>0 && y<0) {
			System.out.println("Quadrante C");
		} else if (x<0 && y<0) {
			System.out.println("Quadrante D");
		} else { 
			System.out.println("O ponto esta sobre o eixo");
		}
			sc.close();
		}
		

	}


