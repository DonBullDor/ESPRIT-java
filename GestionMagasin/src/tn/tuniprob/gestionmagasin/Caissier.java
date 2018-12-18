package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe {

    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int ndc) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = ndc;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return x + " " + "Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}';
    }

    public void showSalary() {
        int heure_supp = super.getNbr_heures() - 180;
        float salaire = 0;
        if (heure_supp > 0) {
            salaire = (5 * 160) + (heure_supp * ((5 / 100) * 115));
        } else {
            salaire = 5 * super.getNbr_heures();
        }
        System.out.println("Salaire du caissier " + super.getNom() + " = " + salaire);
    }
}
