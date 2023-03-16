package Personne;
import Personne.Personne;
import java.time.LocalDate;

public class Etudiant extends Personne {
    private String _email;
    private String _diplome;

    public Etudiant(String nom, String prenom, LocalDate date, String email, String diplome){
        super(nom, prenom, date);
        this._email = email;
        this._diplome = diplome;
    }

    public String get_diplome() {
        return _diplome;
    }

    public void set_diplome(String _diplome) {
        this._diplome = _diplome;
    }

    public String get_email() {
        return _email;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "_email='" + _email + '\'' +
                ", _diplome='" + _diplome + '\'' +
                '}';
    }

    public void set_email(String _email) {
        this._email = _email;
    }
}
