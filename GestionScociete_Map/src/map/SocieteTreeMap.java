/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author Mohamed
 */
public class SocieteTreeMap implements ISociete {

    private TreeMap<Employe, Departement> tm = new TreeMap<Employe, Departement>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        tm.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        tm.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> e : tm.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Map.Entry<Employe, Departement> e : tm.entrySet()) {
            System.out.println(e.getKey());
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (java.util.Map.Entry<Employe, Departement> e : tm.entrySet()) {
            System.out.println(e.getValue());
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement var = tm.get(e);
        System.out.println(var);
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return tm.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return tm.containsValue(e);
    }

}
