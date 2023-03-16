package Formes;

public class Forme extends Point {

    public Forme(int x, int y) {
        super(x, y);
    }

    public void deplacer(Point p){
        this.deplacer(p.get_x(), p.get_y());
    }

    public String dessiner(){
        return "Forme : " + super.toString();
    }
}
