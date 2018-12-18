package etudiant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class University implements IUniversity {
    
    ArrayList<Etudiant> etudiant = new ArrayList<Etudiant>();
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiant.add(e);
    }
    
    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiant.contains(e);
    }
    
    @Override
    public boolean rechercherEtudiant(String nom) {
        /*for (Etudiant etudiant : etudiant) {
            if(etudiant.getNom().equals(nom)) {
                return true;
            }
        }
         */
        for (int i = 0; i < etudiant.size(); i++) {
            if (etudiant.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiant.remove(e);
        displayEtudiants();
    }
    
    @Override
    public void displayEtudiants() {
        System.out.println(etudiant.toString());
    }
    
    @Override
    public void trierEtudiantParId() {
        Collections.sort(etudiant);
    }
    
    @Override
    public void trierEtudiantParNom() {
        Collections.sort(etudiant, new EtudiantComparator());
    }
    
}
