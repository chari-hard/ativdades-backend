import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            ContaBancaria contaBancaria = new ContaBancaria();
            Scanner sc = new Scanner(System.in);

            System.out.println("---Conta bancária---");

            System.out.print("Insira seu nome: ");
            String nomeDoTitular = sc.nextLine();
            contaBancaria.setTitular(nomeDoTitular);

            System.out.print("insira seu limite bancário: ");
            double limiteDaConta = sc.nextDouble();
            contaBancaria.setLimite(limiteDaConta);


            int opcaoSelecionada;

            boolean rodando = true;

            do {
                System.out.println("\n\nSeja bem vindo " + contaBancaria.getTitular() + "! Escolha a opção desejada!");
                System.out.printf("Saldo atual: R$%.2f%n", contaBancaria.getSaldo());
                System.out.printf("Limite atual: R$%.2f%n", contaBancaria.getLimite());

                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Sair");


                opcaoSelecionada = sc.nextInt();

                if (opcaoSelecionada == 1){
                    System.out.printf("Insira o valor que deseja depositar(saldo atual: R$%.2f): ", contaBancaria.getSaldo());
                    double valorDepositado = sc.nextDouble();
                    contaBancaria.depositar(valorDepositado);
                    System.out.printf("%nDepositado com sucesso!!%n%n----------------------------------------------------");

                } else if (opcaoSelecionada == 2) {
                    System.out.printf("Insira o valor que deseja sacar(saldo atual: R$%.2f):", contaBancaria.getSaldo());
                    double valorSacado = sc.nextDouble();
                    contaBancaria.sacar(valorSacado);
                    System.out.printf("%nSacado com com sucesso!!%n%n----------------------------------------------------");

                } else if (opcaoSelecionada == 3) {
                    System.out.printf("%nSistema encerrando...%n%nPrograma finalizado com sucesso!");
                    rodando = false;

                }

            } while(rodando);
        }
    }
