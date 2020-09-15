package Exemplolivro;

public class Livro {
    String titulo;
    String autor;
    int numPaginas;

    public Livro(String tituloLivro, String autorLivro, int numPaginasLivros){
        titulo = tituloLivro;
        autor = autorLivro;
        numPaginas = numPaginasLivros;
    }

    String exibirDados(){
        return titulo + " - " + autor + ": " + numPaginas;
    
    }

    int numPaginas(){
        return numPaginas;
    }
    
}
