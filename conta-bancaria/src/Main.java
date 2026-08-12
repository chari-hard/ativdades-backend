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

            do {
                System.out.println("Seja bem vindo " + contaBancaria.getTitular() + "! Escolha a opção desejada!");
                System.out.println("Saldo atual: R$" + contaBancaria.getSaldo());
                System.out.println("Limite atual: R$" + contaBancaria.getLimite());

                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Sair");


                opcaoSelecionada = sc.nextInt();

                if (opcaoSelecionada == 1){
                    System.out.print("Insira o valor que deseja depositar(saldo atual: R$" + contaBancaria.getSaldo() + "): ");
                    double valorDepositado = sc.nextDouble();
                    contaBancaria.depositar(valorDepositado);
                    System.out.println("Depositado com sucesso!!\n\n----------------------------------------------------");

                } else if (opcaoSelecionada == 2) {
                    System.out.print("Insira o valor que deseja sacar(saldo atual: R$" + contaBancaria.getSaldo() + "): ");
                    double valorSacado = sc.nextDouble();
                    contaBancaria.sacar(valorSacado);
                    System.out.println("Sacado com com sucesso!!\n\n----------------------------------------------------");
                }


            } while(true);



        }
    }
