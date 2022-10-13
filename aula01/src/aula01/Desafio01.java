//package aula01;
//import java.util.Scanner;
//
//public class Desafio01 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entre com três números: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if (a > b && a > c) {
//		System.out.println("O maior numero é: " + a);
//		} else if (b > c) {
//		System.out.println("O maior numero é: " + b);
//		} else {
//		System.out.println("O maior numero é: " + c);
//		}
//		sc.close();
//	}
//}


package aula01;
import java.util.Scanner;

public class Desafio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		mostrarResultado(maior);
		
		sc.close();
				
	}
	
	public static int max(int x, int y, int z) {
		
		int aux;
		if (x > y && x > z) {
		aux = x;
		} else if (y > z) {
		aux = y;
		} else {
		aux = z;
		}
		return aux;		
	}
	
	public static void mostrarResultado(int valor) {
		
		System.out.println("O maior numero é: " + valor);
	}
	
}
