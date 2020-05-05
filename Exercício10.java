import java.util.Scanner;
public class Exercício10 {
// Questão 10
	

	public static void main(String[] args) {
	
		Scanner le = new Scanner(System.in);
		float altura;
		double pesoH;
		double pesoM;	
		String equals;
		String nome, sexo, M = null, F = null, resp;
		do{
		System.out.printf("\n\t Digite o nome da pessoa:");
		nome = le.next();
		System.out.printf("\t Digite o sexo: M/F:");	
		sexo = le.next();
		System.out.printf("\t Digite a altura:");
		altura = le.nextFloat();



		pesoH = ((72.7 * altura)-58);
		pesoM = ((62.1 * altura)-44.7);

		       
		if(sexo.equals("M")){  
		       System.out.printf("\t O peso ideal do %s é %f", nome, pesoH);  
		                 }  
		         else if(sexo.equals("F")){  
		           System.out.printf("\t O peso ideal da   %s é %f", nome, pesoM);  
		      }

		resp = le.next();
		}while(resp.equals ("."));
		
		  }
		  }