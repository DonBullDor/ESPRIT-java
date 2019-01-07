/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author
 */
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (!medecinPatients.containsKey(m)) {
            ajouterMedecin(m);
        }
        medecinPatients.get(m).ajouterPatient(p);
    }
    /*Avec l'api stream */

    public void afficherMap() {
        medecinPatients.entrySet()
                .forEach(System.out::println);
    }

    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedcinPatients(Medecin m) {
        medecinPatients.get(m).getListP().stream()
                .filter(p -> p.getNom().equals("mohamed"))
                .sorted((p1, p2) -> p1.getCin() - p2.getCin())
                .forEach(System.out::println);
    }

    /* Retourner les noms des patients dont le " numSecuriteSociale = 1" */
    public List<String> RetournerNomPatients() {

        return medecinPatients.values().stream()
                .map(e -> e.getListP())
                .reduce((l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                }).get().stream()
                .filter(e -> e.getNumSecuriteSociale() == 1)
                .map(e -> e.getNom()).collect(Collectors.toList());
    }
 public List<String> RetournerNomPatients2() {

        return medecinPatients.values().stream()
                .map(l -> l.getListP())//retourne un stream de List<Patient>
                .reduce((l1, l2) -> { //réduire les Listes en une seule
                    l1.addAll(l2);
                    return l1;   // Optional<List<Patient>>
                }).get().stream()
                .filter(e -> e.getNumSecuriteSociale() == 1)
                .map(e -> e.getNom()).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        Hopital h = new Hopital();
        Medecin m = new Medecin(1, "Mohamed", "Ben Mohamed", 1);
        h.ajouterPatient(m, new Patient(1, "Ali", "Ben Ali", 1));
        h.ajouterPatient(new Medecin(2, "Kamel", "Ben Kamel", 2), new Patient(2, "Ahmed", "Ben Ahmed", 1));
        System.out.println(h.RetournerNomPatients());
    }

}
