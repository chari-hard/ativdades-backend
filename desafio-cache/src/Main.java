import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> banco = new ArrayList<>();
        List<Pessoa> cache = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        banco.add(new Pessoa(1, "jonathan", 25));
        banco.add(new Pessoa(2, "joseph", 25));
        banco.add(new Pessoa(3, "jotaro", 25));
        banco.add(new Pessoa(4, "jolyne", 25));
        banco.add(new Pessoa(5, "johny", 25));

        while (true) {
            System.out.println("\nDigite o ID para buscar (ou 67 para sair): ");
            int idProcurado = sc.nextInt();

            if (idProcurado == 67) {
                System.out.println("Encerrando programa...");
                break;
            }

            Pessoa pessoaEncontradaNoCache = null;

            for (Pessoa a : cache) {
                if (a.getId() == idProcurado) {
                    pessoaEncontradaNoCache = a;
                    break;
                }
            }

            if (pessoaEncontradaNoCache != null) {
                System.out.println("Pessoa encontrada no cache: " + pessoaEncontradaNoCache);
            } else {
                System.out.println("ID não encontrado no cache, procurando no banco...");

                Pessoa pessoaEncontradaNoBanco = null;

                for (Pessoa b : banco) {
                    if (b.getId() == idProcurado) {
                        pessoaEncontradaNoBanco = b;
                        break;
                    }
                }

                if (pessoaEncontradaNoBanco != null) {
                    if (cache.size() >= 10) {
                        Pessoa removida = cache.remove(0);
                        System.out.println("Cache cheio! Removendo: " + removida.getNome());
                    }

                    cache.add(pessoaEncontradaNoBanco);
                    System.out.println("Pessoa encontrada no banco e a1dicionada ao cache: " + pessoaEncontradaNoBanco);
                } else {
                    System.out.println("ID não encontrado no banco de dados.");
                }
            }
        }
        sc.close();
    }
}