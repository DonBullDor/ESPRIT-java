
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class Zoo {

    Map<Secteur, EnsembleAnimaux> map;

    public Zoo() {
		// TODO 13 - à compléter // (0,5 point)
        map = new HashMap<>();
    }

    public void ajouterSecteur(Secteur secteur) {
		// TODO 14 - à compléter // (0,5 point)
        map.put(secteur, new EnsembleAnimaux());
    }

    public void ajouterAnimal(Animal a, Secteur s) {
        // TODO 15 - à compléter // (1,5 point)
		if (map.containsKey(s)) {
            map.get(s).ajouterAnimal(a);
        } else {
            EnsembleAnimaux ea = new EnsembleAnimaux();
            ea.ajouterAnimal(a);
            map.put(s, ea);
        }
    }

    public void afficherZoo() {
		// TODO 16 - à compléter // (1 point)
        map.forEach((s, ea) -> {
            System.out.println(s);
            ea.afficherAnimeaux();
        });
    }

    List<Secteur> contientAnimalCarnivore() {
	// TODO 17 - à compléter -// (1 point)
    // retourne les secteurs contenant au moins un animal carnivore//
    List<Secteur> secteurs = new ArrayList<>();
        for (Map.Entry<Secteur, EnsembleAnimaux> entry : map.entrySet()) {
            if (entry.getValue().getAnimaux().stream().anyMatch(a -> a instanceof AnimalCarnivore)) {
                secteurs.add(entry.getKey());
            }
        }
        return secteurs;
    }

    public AnimalCarnivore lePlusRapide() {
        // TODO 18 - à compléter// (2 points)
        /* avec l'API stream */
		/* Retourne l'animal le plus rapide */
		return map.values().stream().map(ea -> ea.getAnimaux()).reduce((ea1, ea2) -> {
            ea1.addAll(ea2);
            return ea1;
        }).get().stream().filter(a -> a instanceof AnimalCarnivore)
                .collect(Collectors.toCollection(
                                () -> new TreeSet<AnimalCarnivore>(
                                        (a1, a2) -> ((AnimalCarnivore) a1).getVitesse() - ((AnimalCarnivore) a2).getVitesse()
                                )
                        )
                ).stream().findFirst().get();
    }
}
