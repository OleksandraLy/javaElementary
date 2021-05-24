package javaElementary.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Maincoon", 2, 30, 1000);
        Animal dog = new Animal("Malamute", 5, 50, 2000);
        Animal bird = new Animal("parrot", 1, 10, 3000);
        Animal[] animals = {cat, dog, bird};
        System.out.println(animals);
        Arrays.sort(animals, new CompareByPrice());
        System.out.println(animals);
        Arrays.sort(animals, new CompareByBreed());
        System.out.println(animals);

     /*   Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.price == o2.price){
                int comparing = o1.speed - o2.speed;
                return comparing;}
                else {int comparing = o1.price - o2.price;
                return comparing;
            }
        });
        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                int comparing2 = o1.weight - o2.weight;
                return comparing2;
            }
        });
        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                int comparing3 = o1.price - o2.price;
                return comparing3;
            }
        })
    }*/

    }
}
