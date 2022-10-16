package estudos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de numeros a serem somados: ");
		int N = sc.nextInt();
		System.out.println("Entre com os numeros a serem somados: ");
		
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;	
		}
		System.out.println(soma);
		
		sc.close();
		
		}

}
