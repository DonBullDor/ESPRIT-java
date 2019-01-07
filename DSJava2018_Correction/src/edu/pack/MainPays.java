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
public class MainPays {
    public static void main(String[] args) {
        Pays p1 = new Pays("Tunisie", "Afrique");
        Pays p2 = new Pays("France", "Europe");
        Pays p3 = new Pays("Japan", "Asie");
        CitoyenLocal cl1 = new CitoyenLocal("Taher sfar", 258, "Ben ali", "Sami");
        CitoyenLocal cl2 = new CitoyenLocal("Rue liberte", 687, "Nabli", "Asma");
        CityoenExpatrie ex1 = new CityoenExpatrie(p1, 6958, "Dalel", "Ben arab");
        CityoenExpatrie ex2 = new CityoenExpatrie(p2, 6030, "Dorra", "Sehli");
        CityoenExpatrie ex3 = new CityoenExpatrie(p1, 89, "Rami", "Souissi");
        CitoyenLocal cr = new CitoyenLocal("Tunis", 641, "Nouri", "Dalinda");
        p1.ajouterCityoen(ex1);
        p1.ajouterCityoen(ex3);
        p1.ajouterCityoen(ex2);
        p1.ajouterCityoen(cr);
        System.out.println("===> "+p1.getNbPeuple());
        System.out.println(CityoenExpatrie.estTunisien(ex1));
        p1.afficherStat();
        p1.supprimer(ex2);
        p1.afficherStat();
    }
}
