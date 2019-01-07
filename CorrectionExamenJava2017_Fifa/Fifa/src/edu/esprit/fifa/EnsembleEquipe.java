/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.fifa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mehdi
 */
public class EnsembleEquipe {

    public Set<Equipe> equipes;

    public EnsembleEquipe() {
        equipes = new HashSet<>();
    }

    public Set<Equipe> getEquipes() {
        return equipes;
    }

    public void ajouterEquipe(Equipe e) {
        equipes.add(e);
    }

    public void supprimerEquipe(Equipe e) {
        equipes.remove(e);
    }

    /* Avec l’api Stream */
    public boolean rechercherEquipe(Equipe e) {
        return equipes.stream().anyMatch(eq -> eq.equals(e));
    }


    /* Avec les méthodes de réferences */
    public void afficherEquipes() {
        equipes.forEach(System.out::println);
    }

    /* Avec l’ambda Expression */
    public Set<Equipe> trierEquipetsParNom() {
        Set<Equipe> setEquipes = new TreeSet<>((e1, e2) -> e1.getNom().compareTo(e2.getNom()));
        setEquipes.addAll(equipes);
        return setEquipes;
    }

}
