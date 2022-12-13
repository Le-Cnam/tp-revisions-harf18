package net.lecnam.ussi47.revisions.exo1;

public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery", 150);
        Cd cd = new Cd("Izia", "Izia",  12, 2432);

        Emprunteur e = new Emprunteur("Arya", "Stark");

        // Ajouter le livre avec une date de retour le 20/12/2018
        e.emprunte(livre,"20/12/2018");
        // Ajouter le CD avec une date de retour le 20/12/2018
        e.emprunte(cd, "20/12/2018");
        // voir les médias empruntés

        e.listeMediaEmpruntees();

    }

}
