import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // empilha os valores
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        
        while (!pilha.isEmpty()){ //enquanto a pilha não estiver vazia
            System.out.println (pilha.pop()); // desempilha e exibe o numero
        }   

    }

}