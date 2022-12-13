package net.lecnam.ussi47.revisions.exo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprunteur {

    private String nom;
    private String prenom;
    private List<Media> mediasEmprunte;

    public Emprunteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.mediasEmprunte = new ArrayList<>();
    }

    public void emprunte(Media media, String dateRetour) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateRetour);
            media.dateRetour = date;
            mediasEmprunte.add(media);

        } catch (ParseException e) {
            System.out.println("Le date n'est pas valide");
        }
    }

    public void listeMediaEmpruntees() {
        for (Media m : mediasEmprunte) {
            System.out.println(m.toString());
        }
    }


}
