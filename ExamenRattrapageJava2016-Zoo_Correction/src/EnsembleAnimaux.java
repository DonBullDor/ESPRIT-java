
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehdi
 */
public class EnsembleAnimaux implements IEnsembleAnimaux {

    Set<Animal> animaux;

    public EnsembleAnimaux() {
		// TODO 3 - à compléter // (0,5 point)
        animaux = new HashSet<>();
    }

    @Override
    public void ajouterAnimal(Animal animal) {
		// TODO 4 - à compléter // (0,5 point) 
        animaux.add(animal);
    }

    @Override
    public void supprimerAnimal(Animal animal) {
		// TODO 5 - à compléter // (0,5 point)
        animaux.remove(animal);
    }

    @Override
    public boolean chercherAnimal(Animal a) {
		// TODO 6 - à compléter // (0,5 point)
        return animaux.contains(a);
    }

    @Override
    public void afficherAnimeaux() {
		// TODO 8 - à compléter //
        /* avec l'API stream */ (0,5 point)
        animaux.forEach(System.out::println);
    }

    public Set<Animal> getAnimaux() {
        return animaux;
    }

    @Override
    public List<AnimalHerbivore> getAnimauxHerbivores() {
        // TODO 9 - à compléter // (1 point)
		List<AnimalHerbivore> list = new ArrayList<>();
        for (Animal a : ahs) {
            if (a instanceof AnimalHerbivore) {
                list.add((AnimalHerbivore) a);
            }
        }
        return list;
    }

    @Override
    public TreeSet<Animal> trierAnimauxParOrigine() {
        // TODO 10 - à compléter Trier par Origine// (1 point)
		return animaux.stream().collect(Collectors.toCollection(() -> new TreeSet<>((a1, a2) -> a1.getOrigine().compareTo(a2.getOrigine()))));
    }

    @Override
    public double moyenneAgeAnimaux() {
		 // TODO 11 - à compléter//
		 /* avec l'API stream */ (1,5 points)
        return animaux.stream().mapToDouble(a -> a.getAge()).average().getAsDouble();
    }

    @Override
    public double SommeVitesseAnimauxCarnivores() {
		// TODO 12 - à compléter//
        /* avec l'API stream */ (1,5 points)
        return animaux.stream().filter(a -> a instanceof AnimaCarnivore).mapToDouble(a -> ((AnimaCarnivore) a).getVitesse()).sum();
    }

}
