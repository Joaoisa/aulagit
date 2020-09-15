package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        nome= "Não cadastrado";
        idade = 0;
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 18;

    }

	public char[] dados() {
		return null;
	}
    
}
