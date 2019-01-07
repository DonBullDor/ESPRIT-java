/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.fifa;

/**
 *
 * @author Mehdi
 */
public class Joueur {

    private int id;
    private String nom;
    private String nationalite;
    private double salaire;

    public Joueur() {
    }

    public Joueur(int id, String nom, String nationalite, double salaire) {
        this.id = id;
        this.nom = nom;
        this.nationalite = nationalite;
        this.salaire = salaire;
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

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Joueur{" + "id=" + id + ", nom=" + nom + ", nationalite=" + nationalite + ", salaire=" + salaire + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Joueur) {
            final Joueur other = (Joueur) obj;
            return this.id != other.id;
        }
        return false;
    }
}
