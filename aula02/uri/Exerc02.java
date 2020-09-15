package uri;

import java.util.Scanner;

public class Exerc02 {
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        
        media = nota1 * 0.4 + nota2 * 0.6;
        
    if ( media >=6.0) {
        System.out.printf("Aluno aprovado com media " + media);
    } else {
        System.out.printf("Aluno reprovado com media " + media);

    }
        entrada.close();
    
}
