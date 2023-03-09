package TD2;

import java.util.Scanner;

public class exo2 {
    
    public static void main(String [] args){
        int resultat = 0;
        System.out.println("Veuillez saisir un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        resultat = calculFacRec(nb);
        System.out.println("Le resultat de " + nb + " factorielle est = " + resultat);
        scanner.close();
    }

    public static int calculFac(int nb){
        int fact = nb;
        if (nb < 1) return 0;
        else if (nb == 1) return 1;
        else if (nb > 10000) return Integer.MAX_VALUE;
        else {
            for(int i=1; i < nb; i++){
                fact = fact*i;
            }
        }
        return fact;
    }

    public static int calculFacRec(int nb){
        if (nb < 1) return 0;
        else if (nb == 1) return 1;
        else if (nb > 10000) return Integer.MAX_VALUE;
        else return nb * calculFacRec(nb - 1);
    }
}
