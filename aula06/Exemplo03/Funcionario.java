package Exemplo03;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String imprimir(){
        return nome + " : " + salario;
    }

    public void aumentarSalario(double perc){
        salario += salario * (1 + perc);
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario > this.salario){
            
        }
    }


     
}
