package Formes;

public class Carre extends Rectangle{

        public Carre(int x, int y, int longueur) {
            super(x, y, longueur, longueur);
        }

        public String toString(){
            return "Carre : " + super.toString();
        }

        public boolean equals(Carre c){
            if(this.get_longueur() == c.get_longueur()){
                return true;
            }
            else{
                return false;
            }
        }

        public int surface(){
            return this.get_longueur() * this.get_longueur();
        }

        public int perimetre(){
            return this.get_longueur() * 4;
        }
}
