package Personne.test;
import Personne.Personne;
import java.time.LocalDate;
import java.util.Scanner;

public class testPersonne {

    public static void main(String[] args){
        Personne personne1 = new Personne("Buisson", "Lucas", LocalDate.of(2003, 11, 22));
        System.out.println(personne1.toString());
        Personne personne2 = new Personne("Canot", "Thomas", LocalDate.of(2003, 11, 7));
        System.out.println(personne2.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de personnes voulez-vous créer ?");
        String nbstr = scanner.nextLine();
        Integer nb = Integer.valueOf(nbstr);        
        Personne[] personnes = new Personne[nb];
        for(int i = 0; i < nb; i++){
            System.out.println("Veuillez saisir un nom :");
            String nom = scanner.nextLine();
            System.out.println("Veuillez saisir un prenom :");
            String prenom = scanner.nextLine();
            System.out.println("Veuillez saisir une date de naissance :");
            LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            personnes[i] = new Personne(nom, prenom, date);
        }
        scanner.close();
    }
}
