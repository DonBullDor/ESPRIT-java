/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pack;

/**
 *
 * @author 
 */
public class Pays {

    private String libelle;
    private String continent;
    private int nbC;
    private Citoyen[] tab = new Citoyen[800];

    public Pays() {
    }

    public Pays(String libelle, String continent) {
        this.libelle = libelle;
        this.continent = continent;
    }

    public void ajouterCityoen(Citoyen c) {
        if (nbC < 800) {
            tab[nbC] = c;
            nbC++;
            System.out.println("Citoyen ajouté");

        } else {
            System.out.println("Ajout impossible");
        }
    }

    public void afficherStat() {
        int nbcl = 0;
        int nbce = 0;
        for (int i = 0; i < nbC; i++) {
            if (tab[i] instanceof CitoyenLocal) {
                nbcl++;
            } else {
                nbce++;
            }
        }
        System.out.println("Nb Cityoens locaux= " + nbcl + " // Nb Citoyens expatries= " + nbce);
    }
	public void supprimer(Citoyen c) {
        for (int i = 0; i < nbC; i++) {
            if (tab[i].equals(c)) {
                for (int j = i; j < nbC - 1; j++) {
                    tab[j] = tab[j + 1];
                }
                nbC--;
                tab[nbC] = null;
                System.out.println("Cityoen supprimé!");
                return;
            }
        }
        System.out.println("Cityoen introuvable!");
    }
    public boolean estTunisien(Citoyen c) {
        if (c instanceof CityoenExpatrie) {
            if (((CityoenExpatrie) c).getPaysResidence().libelle.equals("Tunisie")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int afficherNbTunisiens() throws NbMaxTunisiens {
        int nb = 0;
        for (int i = 0; i < nbC; i++) {
            if (estTunisien(tab[i])) {
                nb++;
            }
        }
        if (nb > 150) {
            throw new NbMaxTunisiens();
        }
        return nb;
    }

    
}
