import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

// 4. Fa�a um algoritmo que leia dois n�meros e imprima-os em ordem decrescente na tela. 

public class Exerc�cio4 {
	
	public static void main(String[] args) {
	   
		int Num;
		int Num2;
		
		  System.out.print("Digite um n�mero:" );
		  Scanner scanner = new Scanner(System.in);
		Num = scanner.nextInt();
	
		  
		  System.out.print("Digite outro n�mero:" );
		  scanner = new Scanner(System.in);
		Num2 = scanner.nextInt();
	
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = Num; i <= Num2; i++) {
            lista.add(i);
        }
        
        if (Num > Num2) {
        	System.out.println("J� est� em ordem decrescente");
        	
        }
        
        Collections.reverse(lista);   
        
        System.out.print(lista);
        
	    
	}
	}