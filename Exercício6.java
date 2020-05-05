import java.util.Scanner;
// O sistema de avaliação de determinada disciplina é composto por três provas. A primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Considerando que a média para aprovação é 7.0, faça um algoritmo para calcular a média final de um aluno desta disciplina e dizer se o aluno foi aprovado ou não
public class Exercício6 {

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
