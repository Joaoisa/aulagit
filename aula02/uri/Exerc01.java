package uri;

import java.util.Scanner;

public class Exerc01 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        if (numero > 20) {
             System.out.println("Metade: " + (float)numero / 2);
        }

        entrada.close();
    }
}
