package Homework;

public abstract class Animal {
    protected String ID;
    protected String Source;
    protected String dateOfBirth;
    protected String Color;

    // Constructor
    public Animal(String id, String source, String dateOfBirth, String color) {
        this.ID = id;
        this.Source = source;
        this.dateOfBirth = dateOfBirth;
        this.Color = color;
    }

    // Phương thức trừu tượng
    public abstract void makeSound();

    // Hiển thị thông tin cơ bản
    public void displayInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Source: " + Source);
        System.out.println("Date: " + dateOfBirth);
        System.out.println("Color: " + Color);
    }
}

