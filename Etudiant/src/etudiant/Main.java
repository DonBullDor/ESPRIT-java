/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.*;

/**
 *
 * @author Mohamed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Etudiant e1 = new Etudiant(21, "Med", "Ben Abbes");
        Etudiant e2 = new Etudiant(22, "Med2", "Ben Abbes2");
        Etudiant e3 = new Etudiant(21, "Med3", "Ben Abbes2");
        Etudiant e4 = new Etudiant(22, "Med3", "Ben Abbes2");
        
        //System.out.println(e1.equals(e2));
        University university = new University();
        university.ajouterEtudiant(e4);
        university.ajouterEtudiant(e3);
        university.ajouterEtudiant(e2);
        university.ajouterEtudiant(e1);
        
        university.displayEtudiants();
        university.trierEtudiantParNom();
        university.displayEtudiants();*/
        Enseignant e1 = new Enseignant(1, "Flen 1", "Fouleni");
        Enseignant e2 = new Enseignant(2, "Flen 2", "Fouleni 2");
        Enseignant e3 = new Enseignant(2, "Flen 2", "Fouleni 2");
        EspritHashset eh1 = new EspritHashset();
        eh1.ajouterEnseignant(e1);
        eh1.ajouterEnseignant(e2);
        eh1.ajouterEnseignant(e3);
        //System.out.println(eh1.toString());
        //System.out.println(eh1.rechercherEnseignant(e3));
        System.out.println(eh1.rechercherEnseignant(1));

    }

}
