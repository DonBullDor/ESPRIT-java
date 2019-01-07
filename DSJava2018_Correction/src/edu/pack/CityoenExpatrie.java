package edu.pack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public class CityoenExpatrie extends Citoyen {

    public Pays paysOrigine;

    public CityoenExpatrie(Pays paysOrigine, int cin, String nom, String prenom) {
        super(cin, nom, prenom);
        this.paysOrigine = paysOrigine;
    }

    @Override
    public String toString() {
        return super.toString() + paysOrigine.toString();
    }

}
