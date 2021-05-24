package javaElementary.homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static Set<ObjectClass> someHashSet = new HashSet<>();
    static Set<String> roaldDahlBooks = new TreeSet<>();
    public static void main(String[] args) {
        ObjectClass tree = new ObjectClass();
        ObjectClass house = new ObjectClass();
        ObjectClass lampPost = new ObjectClass();
        ObjectClass car = new ObjectClass();
        someHashSet.add(tree);
        someHashSet.add(house);
        someHashSet.add(lampPost);
        someHashSet.add(car);
        someHashSet.remove(house);

        String book1 = "Charlie and the Chocolate Factory";
        String book2 = "Witches";
        String book3 = "Matilda";
        roaldDahlBooks.add(book1);
        roaldDahlBooks.add(book2);
        roaldDahlBooks.add(book3);
        System.out.println(roaldDahlBooks);
        roaldDahlBooks.remove(book2);
        System.out.println(roaldDahlBooks);


    }

}
