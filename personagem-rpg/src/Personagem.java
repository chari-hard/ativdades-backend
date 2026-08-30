public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(){
        this.nivel = 1;
        this.energia = 100;
        this.vida = 100;
    }

    //get

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }

    public int getEnergia(){
        return this.energia;
    }

    public int getNivel(){
        return this.nivel;
    }

    public String getStatus(){
        if (this.vida > 0){
            return "Vivo";
        } else {
            return "Morto";
        }
    }


    //set

    public void setNome(String nome){
        this.nome = nome;
    }

    //outros metodos

    public void receberDano(){
        this.vida -= 25;
        limitarDano();
    }

    public void atacar(){
        if (this.energia >= 9){
            this.energia -= 9;
        } else {
            System.out.println("Energia insuficiente");
        }
    }

    public void descansar(){
        this.energia += 25;
        limitarEnergia();
    }

    public void beberPocaoDeCura(){
        this.vida += 25;
        limitarVida();
    }

    //metodos privados

    private void limitarVida(){
        if (this.vida > 100){
            this.vida = 100;
            System.out.println("Vida máxima alcançada!");
        }
    }
    private void limitarEnergia(){
        if (this.energia > 100){
            this.energia = 100;
            System.out.println("Energia máxima alcançada!");
        }
    }

    private void limitarDano(){
        if (this.vida <= 0){
            this.vida = 0;
            System.out.println("Personagem derrotado!");
        }
    }
}