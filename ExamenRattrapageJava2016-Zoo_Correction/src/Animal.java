
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public abstract class Animal {

    private int id;
    private int age;
    private String origine;

    public Animal() {
    }

    public Animal(int id, int age, String origine) {
        this.id = id;
        this.age = age;
        this.origine = origine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }
// TODO 1 - à compléter //
    /* equals, hashCode et toString */
    /*(1 point)(0,5 point)(0,5 point) */

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", age=" + age + ", origine=" + origine + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.origine, other.origine)) {
            return false;
        }
        return true;
    }


}
