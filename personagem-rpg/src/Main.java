import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("||                                      ||");
        System.out.println("||  Escolha o nome do seu personagem    ||");
        System.out.println("||                                      ||");
        System.out.println("==========================================");
        System.out.print("Digite aqui: ");
        personagem1.setNome(sc.nextLine());

        System.out.println("\n\nBem-vindo " + personagem1.getNome() + "!!");
        System.out.println("status: ");
        System.out.println("Nível: " + personagem1.getNivel());
        System.out.println("Vida: " + personagem1.getVida() + "/100");
        System.out.println("Energia: " + personagem1.getEnergia() + "/100");

        //ate pensei em fazer um sistema grande, mas fica pra proxima

        System.out.printf("");

    }
}