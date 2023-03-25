package Personne;
import java.io.Serializable;
import java.time.LocalDate;

public class Personne implements Serializable {
    private String _nom;
    private String _prenom;
    private LocalDate _date; 

    public Personne(String nom, String prenom, LocalDate date){
        this._nom = nom;
        this._prenom = prenom;
        this._date = date;
    }

    public String getNom(){
        return this._nom;
    }

    public String getPrenom(){
        return this._prenom;
    }

    public LocalDate getDate(){
        return this._date;
    }

    public void setNom(String nom){
        this._nom = nom;
    }

    public void setPrenom(String prenom){
        this._prenom = prenom;
    }

    public void setDate(LocalDate date){
        this._date = date;
    }

    public String toString(){
        return "Nom : " + this._nom + " Prenom : " + this._prenom + " Date de naissance : " + this._date;
    }

    public boolean equals(Personne p){
        if(this._nom == p.getNom() && this._prenom == p.getPrenom() && this._date == p.getDate()){
            return true;
        }
        else{
            return false;
        }
    }

}
