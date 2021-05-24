package javaElementary.lesson1.collection;

public class Animal implements Comparable<Animal>{
    private String breed;
    private int price;

    @Override
    public int compareTo(Animal o) {
        return breed.compareTo(o.getBreed());
    }
    /*@Override
    public int compareTo(Animal o) {
        int tmp = o.price - this.price;
        if (tmp ==0) {
            return 0
        } else
        return tmp;
    }*/


    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


}
