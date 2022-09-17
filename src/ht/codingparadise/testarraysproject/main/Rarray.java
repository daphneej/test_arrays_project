package ht.codingparadise.testarraysproject.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rarray {

     private final ArrayList<String> fruits;
     private int capacite;

     public Rarray(int capacite, ArrayList<String> fruits) throws RarrayError {
          this.fruits = fruits;
     }

    public void add(String fruit) {
          fruits.add(fruit);
    }

    public boolean remove(String fruit) {
          return fruits.remove(fruit);
    }

    public boolean removeAll(String fruit) {
        List<String> listeDesFruitsASupprimer = fruits
                .stream()
                .filter((chaqueFruit) -> Objects.equals(chaqueFruit, fruit))
                .toList();

        return fruits.removeAll(listeDesFruitsASupprimer);
    }

    public void clear() {
          fruits.clear();
    }

    public boolean contains(String fruit) {
          return fruits.contains(fruit);
    }

    public int nbOcc(String fruit) {
          return fruits
                  .stream()
                  .filter(chaqueFruit -> chaqueFruit.equals(fruit))
                  .toList()
                  .size();
    }

    public int size() {
          return fruits.size();
    }
}