package TD2;

import java.util.Random;
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Jeu();
    }

    public static void Jeu() {
        System.out.println("Veuillez saisir un nombre max à deviner");
        Scanner scanner = new Scanner(System.in);
        int ale = scanner.nextInt();
        Random random = new Random();
        int nb = random.nextInt(ale);
        int nombreCoup = 0;
        int[] listeCoup = new int[ale];
        int saisie = 0;
        while (saisie != nb) {
            System.out.println("Veuillez entrer un nombre");
            Scanner scanner2 = new Scanner(System.in);
            saisie = scanner2.nextInt();
            nombreCoup++;
            listeCoup[nombreCoup] = saisie;
            if (saisie < nb) {
                System.out.println("Plus");
            } else if (saisie > nb) {
                System.out.println("Moins");
            }
        }
        System.out.println("Felicitations vous avez reussi en " + nombreCoup + " essais, voici votre liste de coups");
        for (int i = 1; i < nombreCoup + 1; i++) {
            System.out.println(listeCoup[i]);
        }
        System.out.println("Voulez vous rejouer ? (0/1)");
        Scanner scanner3 = new Scanner(System.in);
        int rejouer = scanner3.nextInt();
        if (rejouer == 1) {
            Jeu();
        } else {
            System.out.println("Au revoir");
            System.exit(1);
        }
    }
}
