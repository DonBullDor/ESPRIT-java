/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

/**
 *
 * @author Houssem Eddine
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hopital h = new Hopital();
        Medecin m = new Medecin(1, "Mohamed", "Ben Mohamed", 1);
        h.ajouterPatient(m, new Patient(1, "Ali", "Ben Ali", 1));
        h.ajouterPatient(new Medecin(2, "Kamel", "Ben Kamel", 2), new Patient(2, "Ahmed", "Ben Ahmed", 1));
        System.out.println(h.RetournerNomPatients());
    }
    
}
