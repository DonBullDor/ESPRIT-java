/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karray
 */
public class TestClass {

    public static void main(String[] args) {
        Enfant e1 = new Enfant("Amri", "Imed", 27, 6);
        Enfant e2 = new Enfant("Ben fadhel", "Sana", 24, 20);
        Enfant e3 = new Enfant("Sayah", "Salma", 22, 25);
        Enfant e4 = new Enfant("Khiari", "Manel", 18, 35);

        Attraction att1 = new Attraction(17, "adulte", "Grand 8", 7);
        Attraction att2 = new Attraction(9, "enfant", "CarHit", 4);
        Attraction att3 = new Attraction(4, "enfant", "GardenVisit", 2);
        
        Parc p = new Parc();
        p.ajouterAttraction(att1);
        p.ajouterAttraction(att2);
        p.ajouterAttraction(att3);
        
        p.jouerAttraction(att1, e1);
        p.jouerAttraction(att1, e3);
        p.jouerAttraction(att1, e4);
        p.jouerAttraction(att2, e4);
        p.jouerAttraction(att2, e2);
        p.jouerAttraction(att3, e2);
        p.jouerAttraction(att3, e4);
        
        System.out.println(p.getAttractionPlusJouee());
        System.out.println(p.isEnfantJouePlusieursAttractions());
        System.out.println(p.getNomEnfants());
        Enfant a = p.getEnfantPlusJeune(att3);
        System.out.println(a);
    }
}
