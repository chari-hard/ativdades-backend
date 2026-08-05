public class Main {
    public static void main(String[] args) {

    Bicicreta Bicicreta1 = new Bicicreta("vermelho", "speed", "personalizado");
    System.out.println(Bicicreta1.cor);
    System.out.println(Bicicreta1.modelo);
    System.out.println(Bicicreta1.guidao);

    Caminhao Caminhao = new Caminhao("vermelho", "VW", 4);
    System.out.println(Caminhao.cor);
    System.out.println(Caminhao.modelo);
    System.out.println(Caminhao.eixo);

    Carro Carro = new Carro("vermelho", "BMW", 4);
    System.out.println(Carro.cor);
    System.out.println(Carro.modelo);
    System.out.println(Carro.nDoors);

    Moto Moto = new Moto("vermelho", "carenada", 2018);
    System.out.println(Moto.cor);
    System.out.println(Moto.modelo);
    System.out.println(Moto.ano);

    }
}