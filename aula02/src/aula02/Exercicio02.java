package aula02;

import java.util.Scanner;

public class Exercicio02 {

	
	    public static void main(String args[]) {
//	    	calcularMediaSalario ();
//    	    aumentarSalario();
//        	calcularINSS();
//    	    calcularTercoFerias();
	      }
	    
	    
	    
	   public static void calcularMediaSalario () {
	    	Scanner scan = new Scanner(System.in);
	  		System.out.println("Qual seu salário? ");
	  		float salario = scan.nextFloat();
	  	    float mediasalario = (salario*13) / 12;
	  	    System.out.println("Sua média anual de salário é " + mediasalario);
//	  	    scan.close();
  }
     
	   
       public static void aumentarSalario() {  
    	 Scanner scan = new Scanner(System.in);
    	 int cod = 0;
    	 do {
	        System.out.println("Qual seu cargo? ");
	        System.out.println("1 - Técnico");
	        System.out.println("2 - Gerente");
	        System.out.println("3 - Outros");
	        cod = scan.nextInt();
    	 } while (cod < 1 || cod > 3);
	     System.out.println("Qual seu salário? ");
	     float salario = scan.nextFloat();
    		if (cod == 1) {
    			salario *= 1.5;
    		    System.out.println();
    		} else if (cod == 2) {
    			salario *= 1.3;
    		}  else if (cod == 3) {
    			salario *= 1.2;
    		}
    		System.out.println("O salário é:" + salario);
//            scan.close();
}
      
    public static void calcularINSS() {
    	Scanner scan =  new Scanner(System.in);
    	System.out.println("Qual seu salário mensal?");
    	float salario = scan.nextFloat();
    	float aliquota = 0.075f;
    	float inss = aliquota * salario;
    	System.out.printf("Valor do INSS: Rs %.2f", inss);
//    	scan.close();
    	
    }
    
    public static void calcularTercoFerias() {
    	Scanner scan =  new Scanner(System.in);
    	System.out.println("Qual seu salário mensal?");
    	float salario = scan.nextFloat();
    	float percentual = 0.33f;
    	float tercoferias = percentual * salario;
    	System.out.printf("Valor do Terço de Férias : Rs %.2f", tercoferias);
     	scan.close();
    
    } 
	   
}