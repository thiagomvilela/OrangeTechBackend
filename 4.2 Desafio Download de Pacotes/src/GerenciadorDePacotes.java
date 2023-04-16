import java.util.Scanner;

public class GerenciadorDePacotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int porcentagem = scanner.nextInt();
        for (int i = 0; i < porcentagem; i++) {
            System.out.print("/");
        }
    }
}