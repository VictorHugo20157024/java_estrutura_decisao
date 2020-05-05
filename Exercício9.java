import java.util.Scanner;
// Exercício 9
public class Exercício9 {

	
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		float valor;
		float por45, por30;
		
		System.out.printf("\t Digite o valor do produto:");
		valor = le.nextFloat();
		
	    por45 = ((45 % valor) + valor);
		por30 = ((30 % valor) + valor);
		
		if(valor < 20) {  
		       System.out.printf("\t O valor de venda para o produto é de R$ %f", por45);  
		                 }  
		         else {  
		           System.out.printf("\t O valor de venda para o produto é de R$ %f", por30);  
		      }
		
	
		
		

	}

}
