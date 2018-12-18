package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employe {

    private int tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, int tdv) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tdv;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return x + " " + "Vendeur{" + "tauxDeVente=" + tauxDeVente + '}';
    }

    public void showSalary() {
        float salaire = 450 * this.tauxDeVente;
        System.out.println("Salaire du vendeur " + super.getNom() + " = " + salaire);
    }

}
