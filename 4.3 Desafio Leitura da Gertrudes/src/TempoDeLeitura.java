import java.util.Scanner;

public class TempoDeLeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paginas = scanner.nextInt();
        int dias = paginas / 3;
        System.out.println(dias + " dias");
    }
}