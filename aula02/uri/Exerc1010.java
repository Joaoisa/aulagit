package uri;

import java.util.Scanner;

public class Exerc1010 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
         
    int codP1, codP2, quantP1, quantP2;
    double valorP1, valorP2, valorPagar;

    codP1 = entrada.nextInt();
    codP2 = entrada.nextInt();
    quantP1 = entrada.nextInt();
    quantP2 = entrada.nextInt();
    valorP1 = entrada.nextDouble();
    valorP2 = entrada.nextDouble();

    valorPagar = ((quantP1*valorP1)+quantP2*valorP2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);

    entrada.close();
    }
    
}
