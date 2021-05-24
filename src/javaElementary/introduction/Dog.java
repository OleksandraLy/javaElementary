package javaElementary.introduction;

import javaElementary.introduction.Animal;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Bark");
    }
}
