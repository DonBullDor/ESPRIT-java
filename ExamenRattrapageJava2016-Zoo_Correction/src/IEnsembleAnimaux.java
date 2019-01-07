
import java.util.List;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public interface IEnsembleAnimaux {
    void ajouterAnimal(Animal animal);
    void supprimerAnimal(Animal animal);
    boolean chercherAnimal(Animal a);
    void afficherAnimeaux();
    List<AnimalHerbivore> getAnimauxHerbivores();
    TreeSet<Animal> trierAnimauxParOrigine();
    double moyenneAgeAnimaux();
    double SommeVitesseAnimauxCarnivores();
}
