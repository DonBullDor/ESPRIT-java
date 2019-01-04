package revision;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {

    private List<Patient> listP;

    public ListPatients() {
    }

    public List<Patient> getListP() {
        return listP;
    }

    public void setListP(List<Patient> listP) {
        this.listP = listP;
    }

    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    @Override
    public boolean rechercherPatient(Patient p) {

        boolean test = listP.stream()
                .anyMatch(x -> x.equals(p));

        return test;
    }

    @Override
    public boolean rechercherPatient(int cin) {

        return listP.stream()
                .anyMatch(x -> x.getCin() == cin);
    }

    @Override
    public void afficherPatients() {

        listP.stream().forEach(x -> System.out.println(x));
    }

    @Override
    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted((t, r) -> t.getNom().compareTo(r.getNom())).collect(Collectors.toList());
    }

    public void PatientSansRedondance() {
        listP.stream().distinct()
                .forEach(x -> System.out.println(x));
        //kifkif .forEach(System.out::println);
    }

}
