import java.util.Scanner;
// O sistema de avalia��o de determinada disciplina � composto por tr�s provas. A primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Considerando que a m�dia para aprova��o � 7.0, fa�a um algoritmo para calcular a m�dia final de um aluno desta disciplina e dizer se o aluno foi aprovado ou n�o
public class Exerc�cio6 {

	public static void main(String[] args) {
		
		
	int nota1, nota2, nota3;
	int media;
	
	
	System.out.println("Digite a primeira nota:" );
	Scanner scanner = new Scanner(System.in);
	nota1 = scanner.nextInt();

	System.out.println("Digite a segunda nota:" );
	Scanner scanner1 = new Scanner(System.in);
	nota2 = scanner1.nextInt();
	
	System.out.println("Digite a terceira nota:" );
	Scanner scanner11 = new Scanner(System.in);
	nota3 = scanner11.nextInt();
	
	media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / (10);
			
			if (media >= 7 ) {
	System.out.println("Aprovado" );
			}
			
	else {
		System.out.println("Reprovado" );	
}
	}

	
}
