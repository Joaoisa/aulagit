
import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, maior;

        maior = 0;

        // ler 10 numeros interios
        for (int i = 0; i < 10; i++) {
            System.out.println(" Digite o número inteiro: ");
            numero = in.nextInt();
            if( numero > maior ){
                maior = numero;
            }

        }
        //exibir o maior e o menor
        System.out.println("Maior valor = " + maior);

        in.close(); 

    }
        

}