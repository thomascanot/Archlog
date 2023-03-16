package Formes.test;
import Formes.*;

public class testForme {
    public static void main(String [] args){
        Forme[] tab = new Forme[4];
        tab[0] = new Triangle(1, 2, 3, 4, 5, 6);
        tab[1] = new Rectangle(1, 2, 3, 4);
        tab[2] = new Cercle(1, 2, 3);
        tab[3] = new Cercle(1, 2, 3);
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i].dessiner());
        }
    }
}
