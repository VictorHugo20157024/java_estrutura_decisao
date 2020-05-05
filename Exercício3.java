import java.util.Scanner;
// 3. Faça um algoritmo que leia um número e diga se ele é positivo ou negativo.
public class Exercício3 {

	public static boolean isPositive(float num) {
        return num >= 0;
    }

    public static void main(String[] args){
        float num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um numero:");
        num = entrada.nextFloat();
        boolean retorno = isPositive(num); 
        if (retorno == true){
            System.out.println("O numero é positivo!");
        } else {
            System.out.println("O numero é negativo!");
        }
    }
}