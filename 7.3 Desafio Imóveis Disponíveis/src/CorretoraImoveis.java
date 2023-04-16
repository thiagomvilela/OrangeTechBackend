import java.util.Scanner;

public class CorretoraImoveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] dados = entrada.split("/");
        String classificacao = dados[0];
        String valor = dados[1];
        String disponibilidade = dados[2];
        System.out.printf("Imovel: %s R$%s %s\n", classificacao, valor, disponibilidade);
        sc.close();
    }
}
