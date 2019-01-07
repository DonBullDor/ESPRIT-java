/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.fifa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Mehdi
 */
public class Equipe {

    private int id;
    private String nom;
    private String pays;
    private List<Joueur> joueurs;

    public Equipe() {
    }

    public Equipe(int id, String nom, String pays) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    @Override
    public String toString() {
        return "Equipe{" + "id=" + id + ", nom=" + nom + ", pays=" + pays + ", joueurs=" + joueurs + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Equipe) {
            final Equipe other = (Equipe) obj;
            return this.id != other.id;
        }
        return false;
    }

    public void addJoueur(Joueur j) {
        joueurs.add(j);
    }

    public void supprimerJoueur(Joueur j) {
        joueurs.remove(j);
    }

    public boolean rechercherJoueurParNationalite(String nationalite) {
        return joueurs.stream().anyMatch(j -> j.getNationalite().equals(nationalite));
    }

    public Map<String, List<Joueur>> regrouperParNationalite() {
        return joueurs.stream().collect(Collectors.groupingBy(Joueur::getNationalite));
    }
}
