package net.lecnam.ussi47.revisions.exo1;

public class Cd extends Media{

    private int nbPistes;
    private int dureeEnSecondes;

    public Cd(String titre, String auteur, int nbPistes, int dureeEnSecondes) {
        super(titre, auteur);
        this.nbPistes = nbPistes;
        this.dureeEnSecondes = dureeEnSecondes;
    }

    @Override
    public String toString() {
        return "CD | "  + nbPistes + " | " + dureeEnSecondes + super.toString();
    }
}
