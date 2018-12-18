package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe {

    private float prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, float p) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = p;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return x + " " + "Responsable{" + "prime=" + prime + '}';
    }

    public void showSalary() {
        int heure_supp = super.getNbr_heures() - 160;
        float salaire = 0;
        if (heure_supp > 0) {
            salaire = (10 * 160) + (heure_supp * 12) + this.prime;
        } else {
            salaire = 10 * super.getNbr_heures() + this.prime;
        }
        System.out.println("Salaire du responsable " + super.getNom() + " = " + salaire);
    }
}
