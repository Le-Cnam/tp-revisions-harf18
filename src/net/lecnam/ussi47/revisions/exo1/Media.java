package net.lecnam.ussi47.revisions.exo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Media {
    protected String titre;
    protected String auteur;
    protected Date dateRetour;

    public Media(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        String toString = titre + " | " + auteur;
        if (dateRetour != null) {
            toString += " | A retourner le : " + new SimpleDateFormat("dd/MM/yyyy").format(dateRetour);
        }
        return toString;
    }
}
