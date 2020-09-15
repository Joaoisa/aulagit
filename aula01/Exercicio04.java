
import java.util.Scanner;

public class Exercicio04{
    
}
     public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        double salarioMinino, valorQuilowatt, valorConsumido, quantQuilowatt;

           // Entrada de dados

           System.out.println("Digite salario Minino: ");
           salarioMinimo = entrada.nextDouble();
           System.out.println("Digite quantidade Quilowatt: ");
           quantQuilowatt = entrada.nextDouble();
        
             // Processamento de dados

        valorQuilowatt = (salarioMinimo / 500);
        valorConsumido = (quantQuilowatt * valorQuilowatt);
        valorQuilowatt = (valorConsumido * 0.85);

        System.out.println("O valor, em reais, de cada quilowatt " + valorQuilowatt);
        System.out.println("O valor, em reais, a ser pago por essa residencia: " + valorQuilowatt );
        System.out.println("O valor, em reais, a ser pago com descondo de 15%: " + valorConsumido ;

        entrada.close();
}
