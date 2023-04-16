import java.util.Scanner;

public class VerificadorDeVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int velocidade = scanner.nextInt();
        if (velocidade > 60) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Nao foi multado");
        }
    }
}