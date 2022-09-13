package ht.codingparadise.testarraysproject.test;

import ht.codingparadise.testarraysproject.main.Rarray;
import ht.codingparadise.testarraysproject.main.RarrayError;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class RarrayTest {

    ArrayList<String> listeDesFruits = new ArrayList<>() {
        {
            add("Pomme");
            add("Pomme");
            add("Mango");
            add("Pomme");
            add("Avocat");
            add("Pomme");
        }
    };

    Rarray rarray = new Rarray(0, listeDesFruits);

    RarrayTest() throws RarrayError {
    }

    @Test
    void add() {

        int tailleAvantAjout = listeDesFruits.size();
        rarray.add("Pomme");
        int tailleApresAjout = listeDesFruits.size();

        Assertions.assertTrue(tailleAvantAjout < tailleApresAjout);

        listeDesFruits.forEach(System.out::println);
    }

    @Test
    void remove() {
        int tailleAvantAjout = listeDesFruits.size();
        rarray.remove("Pomme");
        int tailleApresAjout = listeDesFruits.size();

        Assert.assertTrue(tailleAvantAjout > tailleApresAjout);

        listeDesFruits.forEach(System.out::println);
    }

    @Test
    void removeAll() {
        rarray.removeAll("Pomme");
        Assert.assertFalse(listeDesFruits.contains("Pomme"));
        listeDesFruits.forEach(System.out::println);
    }

    @Test
    void clear() {
        int tailleAvantAjout = listeDesFruits.size();
        rarray.clear();
        int tailleApresAjout = listeDesFruits.size();

        Assert.assertTrue(tailleAvantAjout > 0 && tailleApresAjout == 0);

        listeDesFruits.forEach(System.out::println);
    }

    @Test
    void contains() {
        Assert.assertTrue(listeDesFruits.contains("Pomme"));
        listeDesFruits.forEach(System.out::println);
    }

    @Test
    void nbOcc() {
        int sizeDeListeDesFruitsARechercher = this.listeDesFruits
                .stream()
                .filter(fruit -> fruit == "Pomme")
                .toList()
                .size();

        Assertions.assertTrue(rarray.nbOcc("Pomme") == sizeDeListeDesFruitsARechercher);
    }

    @Test
    void size() {
        Assertions.assertTrue(rarray.size() == this.listeDesFruits.size());
    }
}