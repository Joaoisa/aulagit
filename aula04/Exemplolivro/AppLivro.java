package Exemplolivro;

public class AppLivro {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Programação em Java", "Deitel", 437);
        Livro livro2 = new Livro("Engenharia de Software","Tanembaum", 300 );

            System.out.println( livro1.exibirDados() );
        System.out.println( livro2.exibirDados() );
    }
    
}
