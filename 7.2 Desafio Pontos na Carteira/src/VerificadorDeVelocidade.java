import java.util.Scanner;

public class VerificadorDeVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int velocidade = scanner.nextInt();
        int multas = scanner.nextInt();
        if (velocidade > 80) {
            multas++;
        }
        System.out.print(multas + " multas. ");
        if (multas >= 3) {
            System.out.println("Levou pontos na carteira");
        } else {
            System.out.println("Nao levou pontos na carteira");
        }
    }
}