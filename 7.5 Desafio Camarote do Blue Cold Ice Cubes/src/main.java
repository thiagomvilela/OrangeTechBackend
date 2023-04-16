import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoFila = sc.nextInt();
        int pessoasNoCamarote = tamanhoFila / 2 + tamanhoFila % 2;
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
        sc.close();
    }
}
