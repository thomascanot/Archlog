package TD2;

import java.util.Random;
import java.util.Scanner;

public class exo5 {
    public static void main(String [] args){
        Jeu();
    }

    public static void Jeu(){
        System.out.println("Veuillez saisir un nombre max à deviner");
        Scanner scanner = new Scanner(System.in);
        int ale = scanner.nextInt();
        Random random = new Random();
        int nb = random.nextInt(ale);
        int nombreCoup = 0;
        int [] listeCoup = new int[ale];
        int saisie = 0;
        while(saisie != nb){
            System.out.println("Veuillez entrer un nombre");
            Scanner scanner2 = new Scanner(System.in);
            saisie = scanner2.nextInt();
            nombreCoup ++;
            listeCoup[nombreCoup] = saisie;
            if(saisie < nb){
                System.out.println("Plus");
            }
            else if (saisie > nb){
                System.out.println("Moins");
            }
        }
        System.out.println("Felicitations vous avez reussi en " + nombreCoup + " essais, voici votre liste de coups");
        for(int i= 1; i < nombreCoup + 1; i++){
                System.out.println(listeCoup[i]);
        }
        scanner.close();
        int nombrePartie = 0;
        nombrePartie++;
        int [] Score = new int[nombrePartie];
        Score[nombrePartie] = nombreCoup;
        System.out.println("Liste des scores");
        for(int j=0; j < nombrePartie + 1; j++){
            System.out.println(Score[j]);
        }
        System.out.println("Voulez vous rejouer ? (0/1)");
        Scanner scanner3 = new Scanner(System.in);
        int choix = 0;
        choix = scanner3.nextInt();
        if (choix == 0){
            Jeu();
        }
        else if (choix == 1){
            System.exit(1);
        }
        scanner3.close();
}
}
