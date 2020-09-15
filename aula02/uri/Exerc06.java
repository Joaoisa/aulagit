package uri;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;

        System.out.println("Digite seu salário: ");
        salario = in.nextDouble();

        if (salario <= 600.00 ) {
            System.out.println("Isento");
        }
        else{
            if (salario <= 1200.00 ) {
                System.out.println("vai pagar 20%");            
            }else{
                if (salario <= 2000.00 ) {
                    System.out.println("vai pagar 25%");
                }else{
                    System.out.println("Vai pagar 30%");
                }
            }

        }
        in.close();

    }

}
