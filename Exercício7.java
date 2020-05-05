import java.util.Scanner;
// 7. Elabore um algoritmo que leia o nome e a idade de duas pessoas e imprima os dados da pessoa mais velha. 


public class Exercício7 {

	 public static void main(String[] args){
	
		 Scanner input = new Scanner (System.in);
	        
	     String nome1, nome2, aux = null;
	     int idade1, idade2, idade3, maior = -9999, menor = 9999, m = 0;
	   
	     
	     System.out.println ("Insira o nome: ");
	     nome1 = input.nextLine();
	     System.out.println ("Insira a idade do " +nome1);
	     idade1 = input.nextInt();
	     
	    
	     
	     System.out.println ("Insira o nome: ");
	     nome2 = input.next();
	     System.out.println ("Insira a idade do " +nome2);
	     idade2 = input.nextInt();
	        

	        
	        
	     if (idade1 > maior) { 
	         maior = idade1;
	         aux = nome1;
	     }
	     if (idade2 > maior) { 
	         maior = idade2;
	         aux = nome2;
	     } 
	 
	     
	     
	         
	      System.out.println ("A pessoa mais velha é " +aux+ " com " +maior+ " anos de idade");

	        
	        
	   
	}

	}