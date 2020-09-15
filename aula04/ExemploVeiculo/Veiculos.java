package ExemploVeiculo;

public class Veiculos {

    String modelo;
    String marca;
    double consumo;
    
    Veiculos(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
    
	String exibir(){
        return modelo + " marca: " + marca ; 
    }
    
    double consumo(){
        return consumo;
    }

	public char[] exibirVeiculos() {
		return null;
	}
        
    
}
