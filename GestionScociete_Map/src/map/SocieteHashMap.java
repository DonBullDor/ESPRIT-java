/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mohamed
 */
public class SocieteHashMap implements ISociete {

    private HashMap<Employe, Departement> hm = new HashMap<Employe, Departement>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hm.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        hm.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        //Set set = hm.entrySet();
        for (Map.Entry<Employe, Departement> e : hm.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Map.Entry<Employe, Departement> e : hm.entrySet()) {
            System.out.println(e.getKey());
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Map.Entry<Employe, Departement> e : hm.entrySet()) {
            System.out.println(e.getValue());
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement var = hm.get(e);
        System.out.println(var);
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return hm.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return hm.containsValue(e);
    }

}
