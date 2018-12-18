/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author samar
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personne p1 = new Personne(19, "salah");
        Personne p2 = new Personne(29, "ali");
        Personne p3 = new Personne(33, "mohamed");

        List<Personne> persons = new Vector<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        Predicate<Personne> predicate = new Predicate<Personne>() {
            @Override
            public boolean test(Personne t) {
                if (t.getAge() > 20) {
                    return true;
                }
                return false;
            }
        };
        Predicate<Personne> pp = new Predicate<Personne>() {
            @Override
            public boolean test(Personne t) {
                if (t.getAge() > 20) {
                    return true;
                }
                return false;
            }
        };
        System.out.println("Predicate - Liste de personnes dont age>20");

        personneDisplayPredicate(persons, predicate);

        System.out.println("Consumer - Affichage Personnes");

        personneDisplayConsumer(persons, new Consumer<Personne>() {
            @Override
            public void accept(Personne t) {
                System.out.println(t);
            }
        });

        System.out.println("Predicate consumer - Affichage liste personnes dont age >20");
        personneDisplayPredicateConsumer(persons, new Predicate<Personne>() {
            @Override
            public boolean test(Personne t) {
                if (t.getAge() > 20) {
                    return true;
                }
                return false;
            }
        }, new Consumer<Personne>() {
            @Override
            public void accept(Personne t) {
                System.out.println(t);
            }
        });
        
        System.out.println("names : ");
        System.out.println(personneNameDisplay(persons, new Function<Personne, String>() {
            @Override
            public String apply(Personne t) {
                return t.getNom();
            }
        })); 
        System.out.println(" ///////////////////");
    }

    public static void personneDisplay(List<Personne> persons, int age) {
        for (Personne p : persons) {
            if (p.getAge() > age) {
                System.out.println(p);
            }
        }
    }

    public static void personneDisplayPredicate(List<Personne> persons,
            Predicate<Personne> predicate) {
        for (Personne p : persons) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void personneDisplayConsumer(List<Personne> persons,
            Consumer<Personne> consumer) {
        for (Personne p : persons) {
            consumer.accept(p);
        }
    }

    public static void personneDisplayPredicateConsumer(List<Personne> persons,
            Predicate<Personne> predicate, Consumer<Personne> cons) {
        for (Personne p : persons) {
            if (predicate.test(p)) {
                cons.accept(p);
            }
        }
    }

    public static String personneNameDisplay(List<Personne> persons,
            Function<Personne, String> f) {
        String names = "";
        for (Personne p : persons) {
            names += f.apply(p) + " ";
        }
        return names;
    }

    public static Comparator personneNameTrie(Personne p1, Personne p2,
            Comparator<Personne> comp) {
        // comp.compare(p1, p2);
        return comp;

    }

    public static Personne creePersonne(Supplier<Personne> supp) {

        return supp.get();

    }

    public static void convertListStream(List<Personne> ps) {
        Stream<Personne> streamPs = ps.stream();

    }

}
