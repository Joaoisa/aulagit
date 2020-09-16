import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comparacoes {

    public static void main(String[] args) {
        
        ArrayList<Produto> lista = new ArrayList<>();
        HashSet<Produto> set = new HashSet<>();
        HashMap<Integer, Produto> mapa = new HashMap<>();

        Produto p1 = new Produto(12, "Produto1");
        Produto p2 = new Produto(2, "Produto2");

        lista.add(p1);
        lista.add(p1);

        System.out.println("Tamanho da lista: " + lista.size()); 
        System.out.println(lista);

        set.add(p1);
        set.add(p1);

        System.out.println("Tamanho do set: " + set.size()); 
        System.out.println(set);

        mapa.put(1, p1);
        mapa.put(2, p2);

        System.out.println("Tamanho do Map: " + mapa.size()); 
        System.out.println(mapa);

        System.out.println("Produto 111: " + mapa.get(111));
    }
    
}
