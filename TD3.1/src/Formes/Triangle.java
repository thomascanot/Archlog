package Formes;

public class Triangle extends Forme {
    private Point _point1;
    private Point _point2;
    private Point _point3;

    public Triangle(int x, int y, int x1, int y1, int x2, int y2) {
        super(x, y);
        this._point1 = new Point(x1, y1);
        this._point2 = new Point(x2, y2);
        this._point3 = new Point(x, y);
    }

    public Point get_point1() {
        return _point1;
    }

    public void set_point1(Point _point1) {
        this._point1 = _point1;
    }

    public Point get_point2() {
        return _point2;
    }

    public void set_point2(Point _point2) {
        this._point2 = _point2;
    }

    public Point get_point3() {
        return _point3;
    }

    public void set_point3(Point _point3) {
        this._point3 = _point3;
    }

    public void deplacer(int x, int y){
        this._point1.deplacer(x, y);
        this._point2.deplacer(x, y);
        this._point3.deplacer(x, y);
    }
}
