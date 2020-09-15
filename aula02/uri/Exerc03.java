package uri;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        final Scanner entrada = new Scanner(System.in);
        Float numero1, numero2;
        
        System.out.println("Digite o primeira número: ");
        numero1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextFloat();

        if(numero1 >= numero2) { 
            System.out.println("Número 1 = " + numero1 + "Número 2 = " + numero2);
        } else {
            System.out.println("Número 2 = " + numero1 + "Número 1 = " + numero1);
        }

        entrada.close();

    }
}
