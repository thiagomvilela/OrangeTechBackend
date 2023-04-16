import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meses = scanner.nextInt();
        int dinheiro = meses * 50;
        System.out.println(dinheiro);
    }
}