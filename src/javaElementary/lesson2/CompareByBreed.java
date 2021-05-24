package javaElementary.lesson2;

import java.util.Comparator;

public class CompareByBreed implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.breed.compareTo(o2.breed);
    }
}
