import java.util.Scanner;
// 3. Fa�a um algoritmo que leia um n�mero e diga se ele � positivo ou negativo.
public class Exerc�cio3 {

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
            System.out.println("O numero � positivo!");
        } else {
            System.out.println("O numero � negativo!");
        }
    }
}