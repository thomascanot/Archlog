package Formes;

public class Rectangle extends Forme{
    private int _longueur;
    private int _largeur;

    public Rectangle(int x, int y, int longueur, int largeur) {
        super(x, y);
        this._longueur = longueur;
        this._largeur = largeur;
    }

    public int get_longueur() {
        return _longueur;
    }

    public void set_longueur(int _longueur) {
        this._longueur = _longueur;
    }

    public int get_largeur() {
        return _largeur;
    }

    public void set_largeur(int _largeur) {
        this._largeur = _largeur;
    }

    public String toString(){
        return "Rectangle : " + super.toString() + " longueur : " + this._longueur + " largeur : " + this._largeur;
    }

    public boolean equals(Rectangle r){
        if(this._longueur == r.get_longueur() && this._largeur == r.get_largeur()){
            return true;
        }
        else{
            return false;
        }
    }

    public int surface(){
        return this._longueur * this._largeur;
    }

    public int perimetre(){
        return (this._longueur + this._largeur) * 2;
    }

}
