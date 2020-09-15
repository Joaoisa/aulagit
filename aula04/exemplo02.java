import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        int resultado;
        int x, y;
        x = 10;
        y = 50;
        resultado = soma(x, y); //a variavel 'resultado' recebe o retorno do metodo

        System.out.println("Resultado = " + resultado);
    }

    static int soma(int n1, int n2){
        int resp;

        resp = n1 + n2;

        return resp; //devolve o valor da variavel resp para quem chamou o metodo

    }
}
