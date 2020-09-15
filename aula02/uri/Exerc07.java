package uri;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ladoA, ladoB, ladoC;
        
        System.out.println("Digite o tamanho do lado: ");
        
        ladoA= in.nextDouble();
        ladoB= in.nextDouble();
        ladoC= in.nextDouble();

        if (ladoA > ladoB+ladoC) {
            System.out.println("Não é Triangulo");
        }
            if (ladoA && ladoB && ladoC) {
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
