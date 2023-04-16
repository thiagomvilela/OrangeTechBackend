import java.util.Scanner;

public class SalvarMusicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = scanner.nextLine();
        String extensao = nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);
        if (extensao.equals("mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}
