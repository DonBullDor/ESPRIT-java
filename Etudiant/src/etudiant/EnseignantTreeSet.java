/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.TreeSet;

/**
 *
 * @author Mohamed
 */
public class EnseignantTreeSet implements GestionEnseignant {

    private TreeSet<Enseignant> treeset_enseignat;

    public EnseignantTreeSet(TreeSet<Enseignant> treeset_enseignat) {
        this.treeset_enseignat = treeset_enseignat;
    }

    public EnseignantTreeSet() {
        this.treeset_enseignat = new TreeSet<>();
    }

    @Override
    public String toString() {
        return "EnseignantTreeSet{" + "treeset_enseignat=" + treeset_enseignat + '}';
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeset_enseignat.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeset_enseignat.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeset_enseignat.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(treeset_enseignat.toString());
    }

}
