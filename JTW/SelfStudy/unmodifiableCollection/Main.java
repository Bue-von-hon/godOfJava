package unmodifiableCollection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(new Age(1)));

        AnimalList list = new AnimalList(animals);

        for (Animal animal : list.getAnimals()) {
            System.out.println(animal.getAge().getValue());
        }
        System.out.println();
    }

}
