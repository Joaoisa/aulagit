import java.util.Scanner;

public class Exercicio02 {
    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);
        Double nota1, nota2;
        final Double media;

        //Entrada de dados
    
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        //Processamento de dados
        System.out.println( nota1 + nota2  / 2 );

        //Saida da resposta
        System.out.println(" A media é ");

    
        entrada.close();
    }
}
