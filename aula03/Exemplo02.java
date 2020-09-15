import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limite, cont;
        
        System.out.print("Informe o limite ")
        limite = in.nextInt();
        
        cont = 1;

        while(cont <= limite) {
          System.out.println(cont + " ");
          cont*= 2; // isso é o mesmo que: cont = cont * 2
        }
        in.close();
    }
    
}
