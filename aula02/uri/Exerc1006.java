package uri;

import java.util.Scanner;

public class Exerc1006 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
        double A, B, C, soma, media;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        soma = (A * 2) + (B * 3) + (C * 5);
        media = (soma / 10);

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();

    }
}
