package Homework;

public class Dog extends Animal {
    private String breed;
    public Dog(String ID, String Source, String dateOfBirth, String Color, String breed) {
        super(ID, Source, dateOfBirth, Color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kind of dog: " + breed);
        makeSound();
    }
}

