package Personne;

import java.time.LocalDate;
import java.util.Objects;

public class Employe extends Personne {

    private int _ancien;
    private String _entreprise;

    public Employe(String nom, String prenom, LocalDate date, int ancien, String entreprise) {
        super(nom, prenom, date);
        this._ancien = ancien;
        this._entreprise = entreprise;
    }

    public int get_ancien() {
        return _ancien;
    }

    public void set_ancien(int _ancien) {
        this._ancien = _ancien;
    }

    public String get_entreprise() {
        return _entreprise;
    }

    public void set_entreprise(String _entreprise) {
        this._entreprise = _entreprise;
    }

    @Override
    public String toString() {
        return "Employe{" + super.toString() +
                " _ancien=" + _ancien +
                ", _entreprise='" + _entreprise + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return _ancien == employe._ancien && Objects.equals(_entreprise, employe._entreprise);
    }

}
