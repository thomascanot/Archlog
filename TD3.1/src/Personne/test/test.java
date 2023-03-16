package Personne.test;

import Personne.Employe;
import Personne.Etudiant;
import Personne.Personne;

import java.time.LocalDate;

public class test {
    public static void main(String [] args){
        /*Créer un tableau de personnes et ajouter des étudiants et employés*/
        Personne[] personnes = new Personne[4];
        personnes[0] = new Etudiant("Buisson", "Lucas", LocalDate.of(2003, 11, 22), "lucas.buisson@gmail.com", "BUT INFO");
        personnes[1] = new Etudiant("Canot", "Thomas", LocalDate.of(2003, 11, 7), "thomas.canot57@gmail.com", "BUT INFO");
        personnes[2] = new Employe("Canot", "Nicolas", LocalDate.of(2003, 11, 7), 5, "Le reseau" );
        personnes[3] = new Employe("Buisson", "Lulu", LocalDate.of(2003, 11, 22), 3, "IUT METZ" );

        for(int i = 0; i < personnes.length; i++){
            System.out.println(personnes[i].toString());
        }
    }
}
