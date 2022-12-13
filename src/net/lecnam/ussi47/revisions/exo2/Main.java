package net.lecnam.ussi47.revisions.exo2;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Employe e = new Employe("toto", "10/10/1985", "10/10/2022", 2000);
        Employe e2 = new Ingenieur("toto", "10/10/1985", "01/10/2022", 3000, 1);

        e.voirSalaire();
        e2.voirSalaire();

        Societe s = new Societe("MAIF");
        s.addCollaborateur(e);
        s.addCollaborateur(e2);

        Set<Employe> set = s.getListeEmployeeTries();
        for (Employe employe : set) {
            System.out.println(employe.toString());
        }



    }

}
