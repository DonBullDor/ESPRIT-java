package revision;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);

        } else {
            ajouterMedecin(m);
            medecinPatiens.get(m).afficherPatients();
        }
    }

    /*Avec lambda expression */
    public void afficherMap() {
        //medecinPatiens.entrySet().forEach(x->System.out.println(x));
        medecinPatiens.keySet().stream()
                .forEach(t -> System.out.println("Meddecin" + t + "patient" + medecinPatiens.get(t).getListP()));
    }

    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedcinPatients(Medecin m) {
        medecinPatiens.get(m).getListP().stream().
                filter(p -> p.getNom().equals("Mohmed"))
                .forEach(System.out::println);
    }
    /* Retourner les noms des patients dont le " numSecuriteSociale = 1" */
 /*public List<String> RetournerNomPatients (){        
        return medecinPatiens.values()
                .stream().map(x->x.getListP())
                .reduce((l1, l2)->{
                        l1.addAll(l2);
                       return l1 ;
                }).get().stream().filter()
       
    }*/
}
