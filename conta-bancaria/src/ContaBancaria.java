public class ContaBancaria {
    private String titular;
    private double saldo;
    private double limite;

    ///////////////////////////////////////

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    ///////////////////////////////////////


    public double getSaldo(){
        return saldo;
    }

    ///////////////////////////////////////

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    ///////////////////////////////////////

    public void saldoInicial(){
        saldo = 0;
    }

    public void depositar(double depositar){
        if(depositar > 0) {
            saldo = saldo + depositar;
        } else {
            System.out.print("Insira um valor válido!");
        }
    }

    public void sacar(double sacar){
        if (sacar <= saldo){
            saldo = saldo - sacar;
        } else {
            System.out.print("Não é possível sacar um dinheiro que voce nao tem né plmdd");
        }
    }
}
