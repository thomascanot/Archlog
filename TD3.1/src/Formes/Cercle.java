package Formes;

public class Cercle extends Forme{

    private int _rayon;

    public Cercle(int x, int y, int _rayon) {
        super(x, y);
        this._rayon = _rayon;
    }

    public int get_rayon() {
        return _rayon;
    }

    public void set_rayon(int _rayon) {
        this._rayon = _rayon;
    }
}
