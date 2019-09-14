package org.fasttrackit;

import java.util.ArrayDeque;

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
        Toy toy = new Toy();
        toy.name = "Frisbee";
        toy.amount = 3;
        toy.price = 130;
        animal.toy = toy;
        Game game = new Game();
        game.name = "Football";
        game.nameAdopter ="Dorin";
        game.nameVeterinarian = "Adrian";
        game.nameDog = "Rex";
        game.nameCat = "Titica";
        game.nameLizard = "Luffi";
        animal.game = game;
        AnimalFood animalFood = new AnimalFood();
        animalFood.name ="Chap";
        animalFood.price = 13;
        animalFood.amount = 1;
        animal.animalFood = animalFood;

        System.out.println(animal.name);
        System.out.println(animal.health);
        System.out.println(animal.hunger);
        System.out.println(animal.moodLevel);
        System.out.println(animal.nameOfRecreationActivity);
        System.out.println(animal.activity);
        System.out.println(animal.toy);
        System.out.printf("animal.game");
        System.out.println("animal.animalFood");

        Activity activity2 = new Activity();
        activity.name = "Rolling";
        Toy toy2 = new Toy();
        toy.name = "Ball";
        toy.amount = 5;
        toy.price = 150;

        Animal animal2 = new Animal();
        animal2.name = "Thor";

        animal.name = "Ulise";
//        animal.name = null;

        animal.namaeOfFavoriteFoods ="Pedigree";
        animal.nameOfRecreationActivity = "Frisbee";
        animal.age = '5';
        animal.weight = 5;

        animal2.activity = activity;
        animal2.toy = toy;

        //concatenation
        System.out.println("Animal2 name: " + animal2.name);
        System.out.println("Animal1 name: " + animal.name);

        System.out.println(animal2.name);
        System.out.println(animal2.health);
        System.out.println(animal2.hunger);
        System.out.println(animal2.moodLevel);
        System.out.println(animal2.nameOfRecreationActivity);

        Adopter adopter = new Adopter();
        adopter.name = "Dorin";
        adopter.cash = 2500;
        adopter.namaeOfFavoriteFoods = "Steak";
        adopter.nameOfRecreationActivity = "Gym";
        adopter.age = 30;
        adopter.gender ="Male";

        Toy toy3 = new Toy();
        toy.name = "Bone";
        toy.amount = 4;
        toy.price = 120;
        adopter.toy = toy;
        Activity activity3 = new Activity();
        activity.name = "Sleep";
        activity.place = "Home";
        adopter.activity = activity;
        Animal animal3 = new Animal();
        animal.name = "Brutus";
        adopter.animal = animal;
        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.name = "Dorel";
        adopter.veterinarian = veterinarian1;
        Nurse nurse = new Nurse();
        nurse.name = "Ioana";
        nurse.age = 34;
        nurse.gender = "Female";
        adopter.nurse = nurse;

        System.out.println(adopter.name);
        System.out.println(adopter.health);
        System.out.println(adopter.hunger);
        System.out.println(adopter.moodLevel);
        System.out.println(adopter.nameOfRecreationActivity);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Adrian";
        veterinarian.specialization = "DomesticAnimal";
        veterinarian.namaeOfFavoriteFoods = "Pizza";
        veterinarian.priceConsultation = 100;
        veterinarian.age = 33;
        veterinarian.cabinet = 1;
        veterinarian.gender = "Male";
        System.out.printf(veterinarian.name);

        Animal animal4 = new Animal();
        animal.name = "Linda";
        veterinarian.animal = animal;
        Adopter adopter1 = new Adopter();
        adopter.name = "Simina";
        veterinarian.adopter = adopter;
        Nurse nurse1 = new Nurse();
        nurse.name = "Adriana";
        veterinarian.nurse = nurse;













    }
}
