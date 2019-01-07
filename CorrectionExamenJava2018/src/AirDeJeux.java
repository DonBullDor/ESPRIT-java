
import java.util.HashSet;
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
 * @author Karray
 */
public class AirDeJeux {
    Set<Attraction> attractions;

    public AirDeJeux() {
        attractions = new HashSet<>();
    }
    
    public void ajouterAttraction(Attraction a){
        attractions.add(a);
    }
    
    public void supprimerAttraction(Attraction a){
        attractions.remove(a);
    }
    
    public boolean chercherAttractionParDesignation(String designation){
        return attractions.stream().anyMatch(e->e.getDesignation().equals(designation));
    }
    
    public TreeSet<Attraction> trierSelonType(){
        return attractions.stream()
               .collect(Collectors.
                       toCollection(()->
                         new TreeSet<>((a,b)->a.getType().compareTo(b.getType()))));
    }
 
    
}
