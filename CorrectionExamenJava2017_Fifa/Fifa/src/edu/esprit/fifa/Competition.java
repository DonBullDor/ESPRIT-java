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
public class Competition {

    private int id;
    private String nom;

    public Competition() {
    }

    public Competition(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    @Override
    public String toString() {
        return "Competition{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Competition) {
            final Competition other = (Competition) obj;
            return this.id != other.id;
        }
        return false;
    }
}
