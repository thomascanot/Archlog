package TD2;

import java.util.Scanner;

public class exo3 {

    public static void main(String [] args){
        System.out.println("Entrez une chaine à verifier");
        Scanner scanner = new Scanner(System.in);
        String chaine = scanner.nextLine();
        chaine = chaine.toLowerCase();
        boolean palindrome = estPalindrome(chaine);
        if(palindrome == true){
            System.out.println(chaine + " est un palindrome !");
        }
        else{
            System.out.println(chaine + " n'est pas un palindrome !");
        }
        scanner.close();
    }

    public static boolean estPalindrome(String chaine){
        String reversed = "";
        boolean resultat = false;

        for(int i= chaine.length() - 1; i>=0; i--){
            reversed = reversed + chaine.charAt(i);
        }

        if(chaine.equals(reversed)) resultat = true;

        return resultat;
    }
}
