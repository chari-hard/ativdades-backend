public class Pessoa {
    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade;
    }
}
