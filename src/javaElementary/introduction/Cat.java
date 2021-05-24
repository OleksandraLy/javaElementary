package javaElementary.introduction;

import javaElementary.introduction.Animal;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
