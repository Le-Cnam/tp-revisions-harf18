package net.lecnam.ussi47.revisions.exo2;

public class Ingenieur extends Employe {

    int grade;

    public Ingenieur(String nom, String dateNaissance, String dateEmbauche, double salaire, int grade) {
        super(nom, dateNaissance, dateEmbauche, salaire);
        this.grade = grade;
    }

    @Override
    public void voirSalaire(){
        System.out.println(this.salaire + (this.grade * 100));
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
