package javaElementary.lesson1.ex01;

import javaElementary.lesson1.ex01.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 4000);
        Animal dog = new Animal ("Malamute", 3000);
        Animal bird = new Animal ("Crow", 2000);

        Animal[] animals ={cat, dog, bird};
        for (Animal animal : animals) {
            animal.price= animal.price + 1000;
        }
        for (Animal animal : animals) {
            System.out.println(animal.breed+ " " + animal.price);
        }
        int[] x = {2, 5,6,8,9,3};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println();

        for (int tmp : x) {
            System.out.println(tmp + " ");

        }
        for (int tmp : x) {
            System.out.println(tmp+ " ");
        }
    }
}
