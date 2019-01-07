/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pack;

/**
 *
 * @author Karray
 */
public class Citoyen {
    private int cin;
    private String nom;
    private String prenom;

    public Citoyen() {
    }

    public Citoyen(int cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Citoyen other = (Citoyen) obj;
        if (this.cin != other.cin) {
            return false;
        }
        return true;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Citoyen{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    
    
}
