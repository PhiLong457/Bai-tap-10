package Homework;

public class processor {    
    public static void main(String[] args) {

        Animal_List animalList = new Animal_List();

        Dog dog1 = new Dog("D001", "VietNam", "2020-01-15", "Brown", "Shiba");
        Dog dog2 = new Dog("D002", "US", "2019-06-22", "Black", "Labrador");
        Cat cat1 = new Cat("C001", "UK", "2021-03-10", "White", "Tabby");
        Cat cat2 = new Cat("C002", "Japan", "2022-08-18", "Grey", "Bicolor");

        animalList.addAnimal(dog1);
        animalList.addAnimal(dog2);
        animalList.addAnimal(cat1);
        animalList.addAnimal(cat2);

        System.out.println("Animal list:");
        animalList.displayAll();
    }
}

