import java.util.Scanner;
// 2. Elabore um algoritmo que leia dois n�meros inteiros e efetue a adi��o; caso o resultado seja maior que 10, imprima-o na tela.


 public class Exercicio2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int result;
		
		System.out.print("Digite um n�mero:" );
		 Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
   
		System.out.print("Digite outro n�mero:" );
		 Scanner scanner1 = new Scanner(System.in);
		num2 = scanner1.nextInt();
		result = num1 + num2;
		
	if (num1 + num2 > 10 ) {
		System.out.print(result);
	}
		
		
	
	}
}