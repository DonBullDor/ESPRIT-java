/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  
 */
public class ListPatients implements InterfacePatient{
    private List<Patient> listP;

    public ListPatients(){
       listP=new ArrayList<>();
    }

    public List<Patient> getListP() {
        return listP;
    }

    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(Patient p) {
        return listP.stream()
                .anyMatch(e->e.equals(p));
    }
    
/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(int cin) {
         return listP.stream()
                 .anyMatch(p->p.getCin()==cin);
    }
/* Avec l'api stream */
    @Override
    public void afficherPatients() {
        listP.stream()
                .forEach(System.out::println);
    }
    
/* Avec l'api stream */
    @Override
    public void trierPatientsParNom() {
        listP.stream().
                sorted((a,b)->a.getNom().compareTo(b.getNom()));
    }
/* Avec l'api stream */
    public void PatientSansRedondance(){
        listP.stream()
                .distinct()//éliminer les redondances 
                .forEach(System.out::println);
        
    }
    
}
