package Formes;

public class Point {
    private int _x;
    private int _y;

    public Point(int x, int y){
        this._x = x;
        this._y = y;
    }

    public int get_x() {
        return _x;
    }

    public void set_x(int _x) {
        this._x = _x;
    }

    public int get_y() {
        return _y;
    }

    public void set_y(int _y) {
        this._y = _y;
    }

    public String toString(){
        return "x : " + this._x + " y : " + this._y;
    }

    public boolean equals(Point p){
        if(this._x == p.get_x() && this._y == p.get_y()){
            return true;
        }
        else{
            return false;
        }
    }

    public int distance(int x, int y){
        if(this._x > this._y){
            return this._x - this._y;
        }
        else{
            return this._y - this._x;
        }
    }

    public void deplacer(int x, int y){
        this._x = x;
        this._y = y;
    }

}
