import java.util.Scanner;
import javax.swing.*;

// 8. Elabore um algoritmo para testar se uma senha digita � igual a �AEDB�. Se a senha estiver correta escreva �Acesso permitido�, do contrario emita a mensagem �Voc� n�o tem acesso ao sistema�.

public class Exerc�cio8 {
      
	 
	
	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		
	
		String equals;
		String nome, resp;
		
		System.out.printf("\n\t Digite a senha:");
		nome = le.next();
		

	
		
		       
		if(nome.equals("AEDB")){  
		       System.out.printf("\t Acesso permitido.");
		                 }  
		else { 
		           System.out.printf("\t Voc� n�o tem acesso a este sistema.");  
		      }
		

	
		
		  }
		  }