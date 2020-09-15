import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salarioAtual, aumento;

        // Entrada de dados

        System.out.print("Digite salario atual: ");
        salarioAtual = entrada.nextDouble();

        // Processamento de dados

        aumento = (salarioAtual + salarioAtual * 0.25);

        System.out.print("Novo salalario será: " + aumento);

        entrada.close();
    }

}