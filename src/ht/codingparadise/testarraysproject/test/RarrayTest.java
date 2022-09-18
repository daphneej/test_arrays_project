package ht.codingparadise.testarraysproject.test;

import ht.codingparadise.testarraysproject.main.Rarray;
import ht.codingparadise.testarraysproject.main.RarrayError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

class RarrayTest {

    ArrayList<String> fruits = new ArrayList<>() {
        {
            add("Pomme");
            add("Pomme");
            add("Mango");
            add("Pomme");
            add("Avocat");
            add("Pomme");
        }
    };

    Rarray rarray = new Rarray(0, fruits);

    RarrayTest() throws RarrayError {
    }

    @Test
    void add() {
        int tailleAvantAjout = rarray.size();
        rarray.add("Pomme");
        int tailleApresAjout = rarray.size();

        Assertions.assertTrue(tailleAvantAjout < tailleApresAjout);

        fruits.forEach(System.out::println);
    }

    @Test
    void remove() {
        int tailleAvantAjout = fruits.size();
        rarray.remove("Pomme");
        int tailleApresAjout = fruits.size();

        Assertions.assertTrue(tailleAvantAjout > tailleApresAjout);

        fruits.forEach(System.out::println);
    }

    @Test
    void removeAll() {
        rarray.removeAll("Pomme");
        Assertions.assertFalse(fruits.contains("Pomme"));
        fruits.forEach(System.out::println);
    }

    @Test
    void clear() {
        int tailleAvantAjout = fruits.size();
        rarray.clear();
        int tailleApresAjout = fruits.size();

        Assertions.assertTrue(tailleAvantAjout > 0 && tailleApresAjout == 0);

        fruits.forEach(System.out::println);
    }

    @Test
    void contains() {
        Assertions.assertTrue(fruits.contains("Pomme"));
        fruits.forEach(System.out::println);
    }

    @Test
    void nbOcc() {
        int sizeDeListeDesFruitsARechercher = this.fruits
                .stream()
                .filter(fruit -> Objects.equals(fruit, "Pomme"))
                .toList()
                .size();

        Assertions.assertEquals(rarray.nbOcc("Pomme"), sizeDeListeDesFruitsARechercher);
    }

    @Test
    void size() {
        Assertions.assertEquals(rarray.size(), this.fruits.size());
    }
}