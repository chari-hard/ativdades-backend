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

        System.out.println("\nDigite aqui: ");
        personagem1.setNome(sc.nextLine());

        //

    }
}