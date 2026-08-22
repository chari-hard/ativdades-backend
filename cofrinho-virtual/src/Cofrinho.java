public class Cofrinho {

    private String nome;
    private double saldo;
    private double meta;
    private boolean vida;

    public Cofrinho(){
        vida = true;
        saldo = 0;
    }

    //---------------------------------------

    // get

    public String getNome(){
        return this.nome;
    }


    public double getSaldo(){
        return this.saldo;
    }

    public double getMeta(){
        return this.meta;
    }

    public double getProgresso(){
        double porcentagem;
        porcentagem = (saldo / meta) * 100;
        return porcentagem;
    }

    public String getStatus() {
        if (vida){
            return "VOCÊ MATOU ELE! SEU MONSTRO";
        } else if (this.saldo == 0){
            return "Meta não iniciada";
        } else if(this.saldo >= this.meta){
            return "Meta alcançada!!!";
        } else {
            return "Economizando...";
        }
    }

    //--------

    //set

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMeta(double meta){
        if (meta > 0) {
            this.meta = meta;
        } else {
            System.out.print("Insira uma meta válida!!!");
        }
    }

    //---------

    //outros metodos


    public void adicionarDinheiro(double valorDepositado){
        if (valorValido(valorDepositado)){
            this.saldo += valorDepositado;
        }
    }

    public void retirarDinheiro(double valorRetirado){
        if (valorExistente(valorRetirado)){
            this.saldo -= valorRetirado;
        } else {
            System.out.print("ERRO: você não possui saldo suficiente");
        }
    }

    public void matarPorquinho(){
        this.vida = false;
    }

    //----------

    //metodos privados

    private boolean valorValido(double valor){
        return valor > 0;
    }

    private boolean valorExistente(double valor){
        return valor <= this.saldo;
    }

    //--------------------------------------


}
