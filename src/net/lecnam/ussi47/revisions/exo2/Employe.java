package net.lecnam.ussi47.revisions.exo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employe implements Comparable<Employe> {
    protected  String nom;
    protected Date dateNaissance;
    protected Date dateEmbauche;

    protected double salaire;

    public Employe(String nom, String dateNaissance, String dateEmbauche, double salaire) {
        this.nom = nom;
        try {
            this.dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissance);
            this.dateEmbauche = new SimpleDateFormat("dd/MM/yyyy").parse(dateEmbauche);;
        } catch (ParseException e) {
            System.out.println("Erreur dans le format de la date");
        }
        this.salaire = salaire;
    }

    public void voirSalaire(){
        System.out.println(this.salaire);
    }

    public void augmenteSalaire(double augmentation) {
        this.salaire += augmentation;
    }

    @Override
    public String toString() {
        return nom + ';' + dateEmbauche;
    }

    @Override
    public int compareTo(Employe o) {
        return this.dateEmbauche.compareTo(o.dateEmbauche);
    }
}
