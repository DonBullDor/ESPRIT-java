/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author Mohamed
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employe e1 = new Employe(01, "Emp_nom1", "Emp_prenom1");
        Departement d1 = new Departement(01, "department 1");
        SocieteHashMap Societe = new SocieteHashMap();
        SocieteTreeMap TSociete = new SocieteTreeMap();
        Societe.ajouterEmployeDepartement(e1, d1);
        //Societe.afficherLesEmployesLeursDepartements();
        //Societe.afficherDepartement(e1);
        TSociete.ajouterEmployeDepartement(e1, d1);
        TSociete.afficherLesEmployesLeursDepartements();
    }
    
}
