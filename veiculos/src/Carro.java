public class Carro {
    public String cor;
    public String modelo;
    public int nDoors;

    public Carro(String cor, String modelo, int nDoors){
        this.cor = cor;
        this.modelo = modelo;
        this.nDoors = nDoors ;
    }

    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }


    public String andar(){
        return "andando...";
    }

    public String freiar(){
        return "parou";
    }

    @Override
    public String toString() {
        return "";
    }
}