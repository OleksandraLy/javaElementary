package javaElementary.lesson1.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NewClass {
    public final static int ADDRESS[]={40, 50, 60};

    public static void main(String[] args) {

        Animal sphynx = new Animal ("Sphynx", 1000);
        Animal malamute = new Animal ("Malamute", 2000);
        Animal siam = new Animal ("Siam", 3000);

        Animal[] animals = {sphynx, malamute, siam};
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));

        /*List<Animal> animals = new ArrayList();
        animals.add(new Animal ("Sphynx", 1000));
        animals.add(new Animal ("Malamute", 2000));
        animals.add(new Animal ("Siam", 3000));
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            System.out.println(animal);
            iterator.remove();
            System.out.println();
        }
ADDRESS[0]=100;
        System.out.println(Arrays.toString(ADDRESS));*/
    }
}
