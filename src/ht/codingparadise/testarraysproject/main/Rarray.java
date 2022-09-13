package ht.codingparadise.testarraysproject.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rarray {

     private ArrayList<String> fruits;
     private int capacite;

     public Rarray(int capacite, ArrayList fruits) throws RarrayError {
          this.fruits = fruits;
     }

    public void add(String fruit) {
          this.fruits.add(fruit);
    }

    public boolean remove(String fruit) {
          return this.fruits.remove(fruit);
    }

    public boolean removeAll(String fruit) {
        List<String> listeDesFruitsASupprimer = fruits
                .stream()
                .filter((chaqueFruit) -> chaqueFruit == fruit)
                .toList();

        return this.fruits.removeAll(listeDesFruitsASupprimer);
    }

    public void clear() {
          this.fruits.clear();
    }

    public boolean contains(String fruit) {
          return this.fruits.contains(fruit);
    }

    public int nbOcc(String fruit) {
          return this.fruits
                  .stream()
                  .filter(chaqueFruit -> chaqueFruit == fruit)
                  .toList()
                  .size();
    }

    public int size() {
          return this.fruits.size();
    }
}