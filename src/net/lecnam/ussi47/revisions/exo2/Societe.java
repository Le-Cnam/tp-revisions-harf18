package net.lecnam.ussi47.revisions.exo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Societe {
    String nom;
    List<Employe> collaborateurs;

    public Societe(String nom) {
        this.nom = nom;
        collaborateurs = new ArrayList<>();
    }

    public Set<Employe> getListeEmployeeTries() {
        return new TreeSet<>(this.collaborateurs);
    }

    public void addCollaborateur(Employe e) {
        this.collaborateurs.add(e);
    }

    public void exportCsv() throws IOException {
        Path p = Paths.get("employe.csv");
        for(Employe e : this.collaborateurs) {
            Files.write(p, e.toString().getBytes(), StandardOpenOption.APPEND);
        }

    }


}
