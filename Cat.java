package Homework;


  public class Cat extends Animal {
    private String pattern;

    public Cat(String ID, String Source, String dateOfBirth, String Color, String pattern) {
        super(ID, Source, dateOfBirth, Color);
        this.pattern = pattern;
    }

    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kind of cat: " + pattern);
        makeSound();
    }
}  

