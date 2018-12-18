package tn.tuniprob.gestionmagasin;

public class ProduitLegume extends Produit implements Critere {

    private String type = "Legume";

    public ProduitLegume(int id, float prix, String label, float quantite, String season) {
        super(id, prix, label, quantite, season);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int getSeasonNumber(String season) {
        if (season.equals("Janvier")) {
            return 1;
        }
        
            
        if (season.equals("Février")) {
            return 2;
        }
        if (season.equals("Mars")) {
            return 3;
        }
        if (season.equals("Avril")) {
            return 4;
        }
        if (season.equals("Mai")) {
            return 5;
        }
        if (season.equals("Juin")) {
            return 6;
        }
        if (season.equals("Juillet")) {
            return 7;
        }
        if (season.equals("Aout")) {
            return 8;
        }
        if (season.equals("Septembre")) {
            return 9;
        }
        if (season.equals("Octobre")) {
            return 10;
        }
        if (season.equals("Novembre")) {
            return 11;
        }
        if (season.equals("Décembre")) {
            return 12;
        }
        return 0;
    }

    @Override
    public boolean estFrais(String season) {
        if (this.getSeasonNumber(season) - super.getSeason() > 1) {
            return false;
        } else {
            return true;
        }
    }

}
