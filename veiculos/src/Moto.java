public class Moto {
    public String cor;
    public String modelo;
    public int ano;

    public Moto(String cor, String modelo, int ano){
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Moto(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }


    public String andar(){
        return "acelerando...";
    }

    public String darGrau(){
        return  "bolololololo";
    }

    public String freiar(){
        return "parou";
    }

    @Override
    public String toString() {
        return "";
    }
}