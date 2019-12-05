package boisson;

import java.util.Objects;

/**
 * Décrivez votre classe Boisson ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Boisson
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
	private int prix; 
    private double puissance;

    /**
     * Constructeur d'objets de classe Boisson
     */

    public Boisson (String nom, int prix, double puissance) {
        this.nom = nom;
        this.prix = prix;
        this.puissance = puissance;
    }

    public Boisson (String nom) {
        this.nom = nom;
    }

    public String getNom () {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public int getPrix () {
        return prix;
    }

    public void setPrix (int prix) {
        this.prix = prix;
    }

    public double getPuissance () {
        return puissance;
    }

    public void setPuissance (double puissance) {
        this.puissance = puissance;
    }

    @Override
    public boolean equals (Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Boisson boisson = (Boisson) o;
        return nom.equals(boisson.nom);
    }

    @Override
    public int hashCode () {
        return Objects.hash(nom);
    }

    public String effects(){
        String v="vie";
        String V="life";
        String f="force";
        String F="power";
        if(nom.contains(v)|| nom.contains(V))
            return v;
        if(nom.contains(f)|| nom.contains(F))
            return f;
        return "nada";
    }
}