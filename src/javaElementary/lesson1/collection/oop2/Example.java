package javaElementary.lesson1.collection.oop2;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[]marks = {10, 8,-10,1000,50};
        String[] students = {"Alex", "Sasha", "Olga"};

        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        for (String name: students) {
            System.out.println(students);
        }
    }
}
