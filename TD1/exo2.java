package TD1;
import java.util.Scanner;

public class exo2 {
    public static void main(String [] args) {
        int a = 52, b=27;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir x :");
        int x = scanner.nextInt();
        long fx= a * x + b ;
        System.out.println("fx="+fx);
        scanner.close();
        }
}
