/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehdi
 */
public class AnimaCarnivore extends Animal {

    private int vitesse;

    public AnimaCarnivore(int vitesse, int id, int age, String origine) {
        super(id, age,origine);
        this.vitesse = vitesse;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return super.toString() + "AnimaCarnivore{" + "vitesse=" + vitesse + '}';
    }


}
