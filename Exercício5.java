import java.util.Scanner;
// 5. Desenvolva um algoritmo que classifique um n�mero de entrada fornecido pelo usu�rio como par ou �mpar. 

public class Exerc�cio5 {

	public static void main(String[] args) {
       
		int numero;
	
		System.out.print("Digite um n�mero:" );
		 try (Scanner scanner = new Scanner(System.in)) {
			numero = scanner.nextInt();
		}
		int num1 = 3;
	      if((numero  % 2) == 0)  
	         System.out.println("Par");
	      else 
	         System.out.println("�mpar");
		
		

	}

}
