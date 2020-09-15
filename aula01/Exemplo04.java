import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); //entrada será utilizado para ler o teclado
        String nome; // variavel para ler o nome que será difitado
        int idade; //variavel para armazenar a idade da pessoa

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine(); //leitura da String difitada pelo usuário
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();

        System.out.println("Olá " + nome + " você tem " + idade + " anos. ");

        entrada.close();
    }
  
}
