/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehdi
 */
public class AnimalHerbivore extends Animal {

    private String typeHerb;

    public AnimalHerbivore(String typeHerb) {
        this.typeHerb = typeHerb;
    }

    public AnimalHerbivore(String typeHerb, int id, int age, String origine) {
        super(id, age, origine);
        this.typeHerb = typeHerb;
    }

    public String getTypeHerb() {
        return typeHerb;
    }

    public void setTypeHerb(String typeHerb) {
        this.typeHerb = typeHerb;
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalHerbivore{" + "typeHerb=" + typeHerb + '}';
    }

}
