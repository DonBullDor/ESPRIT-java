package tn.tuniprob.gestionmagasin;

import tn.tuniprob.gestionmagasin.Magasin;

public class test {

    public static void main(String[] args) {
        /* Magasin Carrefour */
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-Ville", 20);
        /* Produit pour carrefour */
        ProduitFruit p1 = new ProduitFruit(1254, 0, "Fraise", 12.3f, "Mars");
        ProduitFruit p2 = new ProduitFruit(1224, 0, "Pastèque", 50f, "Juin");
        ProduitFruit p3 = new ProduitFruit(7896, 0, "Mandarine", 25.6f, "Décembre");
        ProduitLegume p4 = new ProduitLegume(8521, 0, "Artichauts", 14f, "Janvier");
        ProduitLegume p5 = new ProduitLegume(8521, 0, "Artichauts", 14f, "Janvier");
        /* Ajout des produits de carrefour */
        carrefour.ajouterProduit(p1);
        carrefour.ajouterProduit(p2);
        carrefour.ajouterProduit(p3);
        carrefour.ajouterProduit(p4);
        carrefour.ajouterProduit(p5);
        /* Employés de carrefour */
        Caissier c1_carrefour = new Caissier(1, "Baha", "Ariana", 100, 1);
        Caissier c2_carrefour = new Caissier(2, "Skander", "Cité Olympique", 100, 2);
        Vendeur v_carrefour = new Vendeur(3, "Mahmoud", "Borj Baccouche", 100, 1000);
        Responsable r_carrefour = new Responsable(4, "Fadhel", "Ariana Soghra", 100, 1500);
        /* Ajout des employés de carrefour */
        carrefour.ajouterEmploye(c1_carrefour);
        carrefour.ajouterEmploye(c2_carrefour);
        carrefour.ajouterEmploye(v_carrefour);
        carrefour.ajouterEmploye(r_carrefour);
        System.out.println(carrefour);
        /* Suppression d'un produit de carrefour */
        carrefour.deleteProduit(p4);
        System.out.println(carrefour);
        /* Test de l'interface Critère */
        System.out.println(p4.getLabel() + " Frais: " + p4.estFrais("Décembre"));
        /* Stock dans carrefour */
        System.out.println("Stock dans carrefour est  = " + carrefour.calculStock());
    }

}
