/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.fifa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Mehdi
 */
public class Fifa {

    private Map<Competition, EnsembleEquipe> map;

    public Fifa() {
        map = new HashMap<>();
    }

    public Fifa(Map<Competition, EnsembleEquipe> map) {
        this.map = map;
    }

    public void ajouterCompetition(Competition c) {
        map.put(c, new EnsembleEquipe());
    }

    public void ajouterEquipe(Competition c, Equipe e) {
        if (!map.containsKey(c)) {
            ajouterCompetition(c);
        }
        map.get(c).ajouterEquipe(e);
    }

    public void afficherFifa() {
        map.forEach((k, v) -> {
            System.out.println(k);
            v.afficherEquipes();
        });
    }

    public List<Equipe> retournerEquipesParPays(String nom) {
        return map.values().stream().map(EnsembleEquipe::getEquipes)
                .reduce((eqs1, eqs2) -> {
                    eqs1.addAll(eqs2);
                    return eqs1;
                }).get().stream().filter(e -> e.getNom().equals(nom))
                .collect(Collectors.toList());

    }

    public void afficherEquipesPersonnalisees(Competition c, String nationalite) {
        map.get(c).getEquipes().stream()
                .filter(e -> e.rechercherJoueurParNationalite(nationalite))
                .forEach(System.out::println);

        // Ou
        map.get(c).getEquipes().stream()
                .filter(e -> e.getJoueurs().stream()
                        .anyMatch(j -> j.getNationalite().equals(nationalite)))
                .forEach(System.out::println);

    }

    public List<Competition> retournerCompetitionParJourTunisien() {
        List<Competition> competitions = new ArrayList<>();
        for (Map.Entry<Competition, EnsembleEquipe> entry : map.entrySet()) {
            for (Equipe e : entry.getValue().equipes) {
                if (e.rechercherJoueurParNationalite("Tunisienne")) {
                    competitions.add(entry.getKey());
                    break;
                }
            }
        }
        return competitions;
    }

    public boolean reournSiUneEquipeParticpeEnPlusieursCompetition() {
        List<Equipe> equipes = new ArrayList<>();
        for (Map.Entry<Competition, EnsembleEquipe> entry : map.entrySet()) {
            equipes.addAll(entry.getValue().equipes);
        }
        Set<Equipe> setEquipes = new HashSet<>(equipes);
        return equipes.size() != setEquipes.size();
    }
}
