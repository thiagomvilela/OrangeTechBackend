import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ingredientes = sc.nextLine();
        String[] ingredientesArray = ingredientes.split(";");
        for (String ingrediente : ingredientesArray) {
            System.out.println(ingrediente);
        }
        sc.close();
    }
}
