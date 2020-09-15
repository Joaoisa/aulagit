package exemplo;

public class Pessoa {
    private String nome;
    private int idade;

    public int getidade(){
        return nome;
    }
    
    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setNome(int nome) {
        if(nome != null && nome.length() > 0 ){
         nome = nome.toUpperCase();
            for(int i=0; i< nome.length(); i++){
                if(nome.charArt(i) < 'A' && nome.charArt(i) > 'Z' ) {
                    return;
                }
            }
            this.nome = nome;

}
