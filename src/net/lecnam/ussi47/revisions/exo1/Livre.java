package net.lecnam.ussi47.revisions.exo1;

public class Livre extends Media{

    int nbPage;

    public Livre(String titre, String auteur, int nbPage) {
        super(titre, auteur);
        this.nbPage = nbPage;
    }

    @Override
    public String toString() {
        return "Livre | " + nbPage + " | " + super.toString();
    }
}
