
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, multiplicador, resultado;

        System.out.print("Digite o numero que deseja saber a tabuada: ");
        numero = in.nextInt();    

        multiplicador = 0;
        
        while(multiplicador <=10) {

            resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++; 
        }
        in.close();
    }
}
