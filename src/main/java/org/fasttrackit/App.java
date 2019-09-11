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
        animal.weight = 13;
        Activity activity = new Activity();
        activity.name = "Running";
        activity.place = "Park";

        animal.activity = activity;

        System.out.println(animal.name);
        System.out.println(animal.health);
        System.out.println(animal.hunger);
        System.out.println(animal.moodLevel);
        System.out.println(animal.nameOfRecreationActivity);
        System.out.println(animal.activity);

        Activity activity2 = new Activity();
        activity.name = "Yard";

        Animal animal2 = new Animal();
        animal2.name = "Thor";

        animal.name = "Ulise";
//        animal.name = null;

        animal.namaeOfFavoriteFoods ="Pedigree";
        animal.nameOfRecreationActivity = "Frisbee";
        animal.age = '5';
        animal.weight = 5;

        animal2.activity = activity;

        //concatenation
        System.out.println("Animal2 name: " + animal2.name);
        System.out.println("Animal1 name: " + animal.name);

        System.out.println(animal2.name);
        System.out.println(animal2.health);
        System.out.println(animal2.hunger);
        System.out.println(animal2.moodLevel);
        System.out.println(animal2.nameOfRecreationActivity);







    }
}
