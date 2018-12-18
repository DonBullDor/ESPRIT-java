package tn.tuniprob.gestionmagasin;

public class Magasin extends Produit {

    private int id;
    private String name;
    private String adresse;
    private int capacité;
    static private Produit[] ensembleProduit = new Produit[50];
    static private Employe[] ensembleEmploye = new Employe[20];
    int index = 0;
    int indexEmpl = 0;

    public Magasin(int id, String name, String adresse, int capacité) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.capacité = capacité;
    }

    private boolean rechercheProduit(Produit p) {
        boolean prodExist = false;
        for (int i = 0; i <= this.index - 1; i++) {
            if (Produit.exist(p, ensembleProduit[i])) {
                prodExist = true;
                System.out.println("Produit trouvé");
                break;
            }
        }
        return prodExist;
    }

    public void ajouterProduit(Produit addProduit) {
        if (ensembleProduit[49] == null && !this.rechercheProduit(addProduit)) {
            ensembleProduit[index] = addProduit;
            index++;
        }
    }

    public void deleteProduit(Produit p) {
        for (int i = 0; i <= this.index - 1; i++) {
            if (Produit.exist(p, ensembleProduit[i])) {
                for (int j = i + 1; j <= this.index - 1; j++) {
                    ensembleProduit[j - 1] = ensembleProduit[j];
                }
                index--;
                break;
            }
        }
    }

    public void ajouterEmploye(Employe newEmpl) {
        if (ensembleEmploye[19] == null) {
            ensembleEmploye[indexEmpl] = newEmpl;
            indexEmpl++;
        }
    }

    public int nbrProduit() {
        return index;
    }

    @Override
    public String toString() {
        String x = "";
        for (int i = 0; i <= this.index - 1; i++) {
            x += "\n" + ensembleProduit[i].toString();
        }
        String employes = "";
        for (int i = 0; i <= this.indexEmpl - 1; i++) {
            employes += "\n" + ensembleEmploye[i].toString();
        }
        return "\nMagasin{" + "id=" + id + ", adresse=" + adresse + ", capacit\u00e9=" + capacité + ", index=" + index + "}\n" + x + "\n Employes:[" + employes + "\n]";
    }

    public float calculStock() {
        float stock = 0f;
        for (int i = 0; i <= this.index - 1; i++) {
            stock += ensembleProduit[i].getQuantite();
        }
        return stock;
    }

    public static Magasin moreProducts(Magasin m1, Magasin m2) {
        if (m1.nbrProduit() > m2.nbrProduit()) {
            return m1;
        } else {
            return m2;
        }
    }
}
