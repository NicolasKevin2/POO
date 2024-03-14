import java.lang.String;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        carro carro1 = new carro();
        carro1.setId(1);
        carro1.setFabricante("Fiat");
        carro1.setModelo("Punto");
        carro1.setAnofabricacao(2017);
        carro1.setCor("Vermelho");
        carro1.getFabricante();
    }
}