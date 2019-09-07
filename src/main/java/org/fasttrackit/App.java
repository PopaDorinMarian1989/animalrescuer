package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Rex";
        animal.namaeOfFavoriteFoods ="Chap";
        animal.nameOfRecreationActivity = "Fetc";
        animal.age = '3';

        Adopter adopter = new Adopter();
        adopter.name = "Dorin";
        adopter.cash = 300;
        animal.adopter = adopter;

        System.out.println(animal.name);
        System.out.println(animal.health);
        System.out.println(animal.hunger);
        System.out.println(animal.moodLevel);
        System.out.println(animal.adopter);

        Animal animal2 = new Animal();
        animal2.name = "Thor";

        animal.name = "Ulise";
//        animal.name = null;

        animal.namaeOfFavoriteFoods ="Pedigree";
        animal.nameOfRecreationActivity = "Frisbee";
        animal.age = '5';

        Adopter adopter2 = new Adopter();
        adopter.name = "Marian";
        adopter.cash = 500;
        animal2.adopter = adopter;


        System.out.println("Animal2 name: " + animal2.name);
        System.out.println("Animal1 name: " + animal.name);






    }
}
