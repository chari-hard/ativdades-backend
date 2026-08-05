//kkkkkkkkkkkkkkkkkkkk

public class Bicicreta {
    public String cor;
    public String modelo;
    public String guidao;

    public Bicicreta(String cor, String modelo, String guidao){
        this.cor = cor;
        this.modelo = modelo;
        this.guidao = guidao;
    }

    public Bicicreta(String cor, String guidao) {
        this.cor = cor;
        this.guidao = guidao;
    }


    public String andar(){
        return "pedalei";
    }

    public String freiar(){
        return "parou";
    }

    @Override
    public String toString() {
        return "";
    }
}
