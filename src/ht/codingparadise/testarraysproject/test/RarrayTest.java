package ht.codingparadise.testarraysproject.test;

import ht.codingparadise.testarraysproject.main.Rarray;
import ht.codingparadise.testarraysproject.main.RarrayError;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RarrayTest {

    ArrayList<String> listeDesFruits = new ArrayList<String>(){
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

    @org.junit.jupiter.api.Test
    void add() {

        int tailleAvantAjout = listeDesFruits.size();
        rarray.add("Pomme");
        int tailleApresAjout = listeDesFruits.size();

        Assert.assertTrue(tailleAvantAjout < tailleApresAjout);

        listeDesFruits.forEach(System.out::println);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        int tailleAvantAjout = listeDesFruits.size();
        rarray.remove("Pomme");
        int tailleApresAjout = listeDesFruits.size();

        Assert.assertTrue(tailleAvantAjout > tailleApresAjout);

        listeDesFruits.forEach(System.out::println);
    }

    @org.junit.jupiter.api.Test
    void removeAll() {
        rarray.removeAll("Pomme");
        Assert.assertFalse(listeDesFruits.contains("Pomme"));
        listeDesFruits.forEach(System.out::println);
    }

    @org.junit.jupiter.api.Test
    void clear() {
          int tailleAvantAjout = listeDesFruits.size();
        rarray.clear();
        int tailleApresAjout = listeDesFruits.size();

        Assert.assertTrue(tailleAvantAjout > 0 && tailleApresAjout == 0);

        listeDesFruits.forEach(System.out::println);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        Assert.assertTrue(listeDesFruits.contains("Pomme"));
        listeDesFruits.forEach(System.out::println);
    }

    @org.junit.jupiter.api.Test
    void nbOcc() {
//        Integer nombreOccurence = rarray.nbOcc("Pomme");
//
//        assertInstanceOf(nombreOccurence, new Integer(nombreOccurence));
    }

    @org.junit.jupiter.api.Test
    void size() {
    }
}