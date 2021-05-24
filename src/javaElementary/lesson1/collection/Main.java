package javaElementary.lesson1.collection;

import java.util.*;

public class Main {
    static Human human = new Human();
    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList();

        LinkedList linkedList = new LinkedList();
        HashSet <Human> hashSet = new HashSet();
        hashSet.add(human);

        List<String> list = new ArrayList<>();
        list.add("hello");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
        }

        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String var = stringListIterator.next();
            System.out.println(var);
        }

    }
    static class Human{

    }
}
