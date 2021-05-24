package javaElementary.lesson2;

import java.util.Comparator;

public class CompareBySpeed implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.speed - o2.speed;
    }
}
