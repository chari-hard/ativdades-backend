import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Cofrinho cofrinho = new Cofrinho();
        Scanner sc = new Scanner(System.in);

        boolean rodando = true;
        int opcaoEscolhida;


        do {
            System.out.printf("%n%n============================================%n");
            System.out.println("Bem-vindo(a) ao seu cofrinho virtual!");
            System.out.println(cofrinho.getStatus());

            if (cofrinho.getMeta() == 0){
                System.out.print("- Para começar, defina uma meta: ");
                cofrinho.setMeta(sc.nextDouble());
            }

            System.out.printf("\n- Meta atual: R$%.2f", cofrinho.getMeta());
            System.out.printf("\n- Saldo atual: R$%.2f", cofrinho.getSaldo());
            System.out.printf("\n- Progresso: %.0f", cofrinho.getProgresso());
            System.out.print("%");

            System.out.println("\n-----------------------------");

            System.out.println("- O que deseja fazer agora?: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            System.out.println("4 - matar.");

            opcaoEscolhida = sc.nextInt();
            sc.nextLine();



            switch (opcaoEscolhida) {

                case 1:
                    System.out.print("Insira o valor que deseja depositar: ");
                    cofrinho.adicionarDinheiro(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Insira o valor que deseja sacar:");
                    cofrinho.retirarDinheiro(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Programa finalizado.");
                    rodando = false;
                    break;

                case 4:
                    System.out.println("Você tem certeza?(y/n): ");
                    String opcaoSelecionada = sc.nextLine();

                    if (opcaoSelecionada.equals("y")){
                        System.out.println("Você matou ele.");
                        cofrinho.matarPorquinho();
                        break;
                    } else if (opcaoSelecionada.equals("n")) {
                        System.out.println("Você tem um bom coração.");
                        break;
                    }

                default:
                    System.out.print("Insira uma opção válida!");
                    break;
            }

            System.out.println("=================================\n\n");
        } while (rodando);
    }
}