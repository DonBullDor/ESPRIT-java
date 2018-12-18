package etudiant;

import java.util.HashSet;

public class EspritHashset implements GestionEnseignant {

    private HashSet<Enseignant> list_enseignat;

    public EspritHashset(HashSet<Enseignant> list_enseignat) {
        this.list_enseignat = list_enseignat;
    }

    public EspritHashset() {
        this.list_enseignat = new HashSet<>();
    }

    public void ajouterEnseignant(Enseignant e) {
        list_enseignat.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return list_enseignat.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        boolean test = false;
        for (Object e : list_enseignat) {
            Enseignant ens = (Enseignant) e;
            if (ens.getId() == id) {
                test = true;
            }
        }
        return test;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        list_enseignat.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(list_enseignat.toString());
    }

    @Override
    public String toString() {
        return "EspritHashset{" + "list_enseignat=" + list_enseignat + '}';
    }

}
