    import java.util.Scanner;

    public class Exemplo04 {
        public static void main(String[] args) {
           int numVogais = contaVogais("Boa Tarde! Vamos programar.");

           System.out.println("Foram encontradas " + numVogais + " vogais");
        }

        static int contaVogais(String frase){
            String aux = frase.toUpperCase();

            System.out.println(aux);

            return 0;

    }
}


