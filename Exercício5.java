import java.util.Scanner;
// 5. Desenvolva um algoritmo que classifique um número de entrada fornecido pelo usuário como par ou ímpar. 

public class Exercício5 {

	public static void main(String[] args) {
       
		int numero;
	
		System.out.print("Digite um número:" );
		 try (Scanner scanner = new Scanner(System.in)) {
			numero = scanner.nextInt();
		}
		int num1 = 3;
	      if((numero  % 2) == 0)  
	         System.out.println("Par");
	      else 
	         System.out.println("Ímpar");
		
		

	}

}
