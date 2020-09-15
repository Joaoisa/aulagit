package ExemploVeiculo;

public class AppVeiculos {
    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos("Civic", "Honda", 8.0);
        Veiculos veiculo2= new Veiculos("Corolla","Toyota", 7.0);

        System.out.println( veiculo1.exibir());
        System.out.println("O consumo do carro 1 é " + veiculo1.consumo() + "km/l");

        System.out.println(veiculo2.exibir());
        System.out.println("O consumo do carro 1 é " + veiculo2.consumo() + "km/l");
    }    
    
}
