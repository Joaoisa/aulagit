import java.util.Stack;

public class ConverterPilha {
    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack<>();
        int decimal = 345;

        System.out.print("O valor " + decimal + " convertido  em binario é ");
        while(decimal !=0 ){
            int resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2; 
        }

        while(! pilha.isEmpty()){
           System.out.print( pilha.pop());
        }

        System.out.println("");
    }
    
}
