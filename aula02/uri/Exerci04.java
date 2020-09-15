package uri;

import java.util.Scanner;

public class Exerci04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, valorPrestacao;

        System.out.println("Digite o seu salário Bruto: ");
        salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da prestação: ");
        valorPrestacao = entrada.nextDouble();
       

        if (valorPrestacao <= salarioBruto * 0.3) {
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("Emprestimo nao disponivel");
        }
        entrada.close();
    }
}
