package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {

    //static int nombre;
    private int id;
    private float prix;
    private String label;
    private float quantite;
    private int season;

    public Produit(int id, float prix, String label, float quantite, String season) {
        this.id = id;
        this.prix = prix;
        this.label = label;
        this.quantite = quantite;
        if (season.equals("Janvier")) {
            this.season = 1;
        }
        if (season.equals("Février")) {
            this.season = 2;
        }
        if (season.equals("Mars")) {
            this.season = 3;
        }
        if (season.equals("Avril")) {
            this.season = 4;
        }
        if (season.equals("Mai")) {
            this.season = 5;
        }
        if (season.equals("Juin")) {
            this.season = 6;
        }
        if (season.equals("Juillet")) {
            this.season = 7;
        }
        if (season.equals("Aout")) {
            this.season = 8;
        }
        if (season.equals("Septembre")) {
            this.season = 9;
        }
        if (season.equals("Octobre")) {
            this.season = 10;
        }
        if (season.equals("Novembre")) {
            this.season = 11;
        }
        if (season.equals("Décembre")) {
            this.season = 12;
        }
    }

    public Produit() {
    }

    void affiche() {
        System.out.println("L'id : " + id + " \n Label : " + label + " \n Prix : " + prix + "\n \n");
    }

    @Override
    public String toString() {
        return ("L'id : " + id + " \n Label : " + label + " \n Prix : " + prix + "\n \n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(String season) {
        if (season.equals("Janvier")) {
            this.season = 1;
        }
        if (season.equals("Février")) {
            this.season = 2;
        }
        if (season.equals("Mars")) {
            this.season = 3;
        }
        if (season.equals("Avril")) {
            this.season = 4;
        }
        if (season.equals("Mai")) {
            this.season = 5;
        }
        if (season.equals("Juin")) {
            this.season = 6;
        }
        if (season.equals("Juillet")) {
            this.season = 7;
        }
        if (season.equals("Aout")) {
            this.season = 8;
        }
        if (season.equals("Septembre")) {
            this.season = 9;
        }
        if (season.equals("Octobre")) {
            this.season = 10;
        }
        if (season.equals("Novembre")) {
            this.season = 11;
        }
        if (season.equals("Décembre")) {
            this.season = 12;
        }
    }

    public boolean exist(Produit p) {
        if (this.getId() == p.getId() && this.getPrix() == p.getPrix() && this.getLabel().equalsIgnoreCase(p.getLabel())) {
            return true;
        }
        return false;
    }

    public static boolean exist(Produit p1, Produit p2) {
        if (p1.getId() == p2.getId() && p1.getPrix() == p2.getPrix() && p1.getLabel().equalsIgnoreCase(p2.getLabel())) {
            return true;
        }
        return false;
    }
}
