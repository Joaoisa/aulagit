package uri;

import java.util.Scanner;

class Exerc1001 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A, B, X;
        
        A = entrada.nextInt();
        B = entrada.nextInt();

        X = A + B;

        System.out.println("SOMA = " + X);

        entrada.close();
    }
}