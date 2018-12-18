package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Afficher tous les employ�s */
        employees.stream()
                .forEach(t -> System.out.println(t));

        /*
		 * TO DO 2: Afficher les employ�s dont le nom commence par la lettre n
         */
        employees.stream()
                .filter(t -> t.getName().startsWith("n"))
                .forEach(t -> System.out.println(t));

        /*
		 * TO DO 3: Afficher les employ�s dont le nom commence par la lettre n
		 * et le salaire> 1000
         */
        employees.stream()
                .filter(t -> t.getName().startsWith("n"))
                .filter(t -> t.getSalary() > 1000)
                .forEach(t -> System.out.println(t));

        /*
		 * TO DO 4: Afficher les employ�s dont le nom commence par la lettre s
		 * tri�s par salaire
         */
        employees.stream()
                .filter(t -> t.getName().startsWith("s"))
                .sorted((t, n) -> t.getSalary() - n.getSalary())
                .forEach(t -> System.out.println(t));

        /*
		 * TO DO 5: Afficher les noms des employ�s dont le salaire > 600 avec 2
		 * mani�res diff�rentes
         */
 /* First Way */
        employees.stream()
                .filter(t -> t.getSalary() > 600)
                .forEach(t -> System.out.println(t));
        /* Second Way */
        employees.stream()
                .filter(t -> t.getSalary() > 600)
                .map(t -> t.getName())
                .forEach(t -> System.out.println(t));

        /*
		 * TO DO 6: Ajouter 200 D pour les employ�s dont le nom commence avec m
		 * et les affich�s ensuite
         */
        employees.stream()
                .filter(t -> t.getName().startsWith("m"))
                .forEach(t -> {
                    t.setSalary(t.getSalary() + 200);
                    System.out.println(t);
                });

    }
}
