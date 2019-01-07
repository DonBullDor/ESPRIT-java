/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pack;

/**
 *
 * @author Karray
 */
public class CitoyenLocal extends Citoyen{
    public String adresse;

    public CitoyenLocal(String adresse, int cin, String nom, String prenom) {
        super(cin, nom, prenom);
        this.adresse = adresse;
    }
    
    public String toString(){
      return  super.toString()+" Adresse: "+adresse;
    }

    @Override
    public boolean equals(Object obj) {
       boolean res = super.equals(obj);
       boolean res2 =false;
       
         if (obj == null) {
            res2= false;
        }
        if (getClass() != obj.getClass()) {
            res2= false;
        }
        final CitoyenLocal other = (CitoyenLocal) obj;
        if (this.adresse.equals((other.adresse))) {
            res2= true;
        }
        if(res == true && res2==true)
            return true;
        else
        return false;
    }
    
    
}
