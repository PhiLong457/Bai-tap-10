package Homework;

import java.util.ArrayList;

public class Animal_List {
    private ArrayList<Animal> animals;

    public Animal_List() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAll() {
        for (Animal animal : animals) {
            animal.displayInfo();
            System.out.println("----------------------");
        }
    }
}
