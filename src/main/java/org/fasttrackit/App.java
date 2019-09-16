package org.fasttrackit;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Animal animal = new Animal("");
        animal.setName("Rex");
        animal.setNamaeOfFavoriteFoods("Chap");
        animal.setNameOfRecreationActivity("Fetc");
        animal.setAge(3);
        animal.setAge(13);
        Activity activity = new Activity();
        activity.setName("Running");
        activity.setPlace("Park");
        animal.activity = activity;
        Toy toy = new Toy();
        toy.setName("Frisbee");
        toy.setAmount(3);
        toy.setPrice(130);
        animal.toy = toy;
        Game game = new Game();
        game.setName("Football");
        game.setNameAdopter("Dorin");
        game.setNameVeterinarian("Adrian");
        game.setNameDog("rex");
        game.setNameCat("Titica");
        game.setNameLizard("Luffi");
        animal.game = game;
        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Chap");
        animalFood.setPrice(13);
        animalFood.setAmount(1);
        animal.animalFood = animalFood;

        System.out.println(animal.getName());
        System.out.println(animal.getHealth());
        System.out.println(animal.getHunger());
        System.out.println(animal.isMoodLevel());
        System.out.println(animal.getNameOfRecreationActivity());
        System.out.println(animal.activity);
        System.out.println(animal.toy);
        System.out.println(animal.game);
        System.out.println(animal.animalFood);


        Activity activity2 = new Activity();
        activity.setName("Rolling");
        Toy toy2 = new Toy();
        toy.setName("Ball");
        toy.setAmount(5);
        toy.setPrice(150);

        Animal animal2 = new Animal("");
        animal2.setName("Titica");
//        animal.name = "Ulise";
//        animal.name = null;

        animal2.setNamaeOfFavoriteFoods("Pedigree");
        animal2.setNameOfRecreationActivity("Frisbee");
        animal2.setAge(5);
        animal2.setWeight(5);

        animal2.activity = activity;
        animal2.toy = toy;

        //concatenation
        System.out.println("Animal2 name: " + animal2.getName());
        System.out.println("Animal1 name: " + animal.getName());

        System.out.println(animal2.getName());
        System.out.println(animal2.getHealth());
        System.out.println(animal2.getHealth());
        System.out.println(animal2.isMoodLevel());
        System.out.println(animal2.getNameOfRecreationActivity());

        Animal animal3 = new Animal("");
        animal3.setName("Luffi");
        animal3.setNamaeOfFavoriteFoods("Worms");
        animal3.setNameOfRecreationActivity("Sleep");
        animal3.setAge(1);
        animal3.setWeight(1);
        System.out.println(animal3.getName());
        System.out.println(animal3.getHealth());
        System.out.println(animal3.getHunger());
        System.out.println(animal3.isMoodLevel());
        System.out.println(animal3.getNameOfRecreationActivity());


        Dog dog = new Dog("");
        dog.setColor("Black");
        dog.setGender("Male");
        dog.setBreed("Jindo");
        dog.setTypeOfDog("Hunting");
        System.out.println(dog.getColor());
        System.out.println(dog.getGender());
        System.out.println(dog.getBreed());
        System.out.println(dog.getTypeOfDog());

        Cat cat = new Cat("");
        cat.setColor("Red");
        cat.setGender("Female");
        cat.setBreed("Bombay");
        cat.setSize("Small");
        System.out.println(cat.getColor());
        System.out.println(cat.getGender());
        System.out.println(cat.getBreed());
        System.out.println(cat.getSize());

        Lizard lizard = new Lizard("");
        lizard.setColor("Green");
        lizard.setGender("Male");
        lizard.setLocationOfBirth("Asia");
        System.out.println(lizard.getColor());
        System.out.println(lizard.getGender());
        System.out.println(lizard.getLocationOfBirth());

        Adopter adopter = new Adopter();
        adopter.setName("Dorin");
        adopter.setCash(2500);
        adopter.setNamaeOfFavoriteFoods("Steak");
        adopter.setNameOfRecreationActivity("Gym");
        adopter.setAge(30);
        adopter.setGender("Male");

        Toy toy3 = new Toy();
        toy.setName("Bone");
        toy.setAmount(4);
        toy.setPrice(120);
        adopter.toy = toy;
        Activity activity3 = new Activity();
        activity.setName("Sleep");
        activity.setPlace("Home");
        adopter.activity = activity;
        Animal animal4 = new Animal("");
        animal.setName("Brutus");
        adopter.animal = animal;
        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.setName("Dorel");
        adopter.veterinarian = veterinarian1;
        Nurse nurse = new Nurse();
        nurse.setName("Ioana");
        nurse.setAge(34);
        nurse.setGender("Female");
        adopter.nurse = nurse;

        adopter.money(300,100);

        System.out.println(adopter.getName());
        System.out.println(adopter.getHealth());
        System.out.println(adopter.getHunger());
        System.out.println(adopter.isMoodLevel());
        System.out.println(adopter.getNameOfRecreationActivity());

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Adrian");
        veterinarian.setSpecialization("DomesticAnimal");
        veterinarian.setNamaeOfFavoriteFoods("Pizza");
        veterinarian.setPriceConsultation(100);
        veterinarian.setAge(33);
        veterinarian.setCabinet(1);
        veterinarian.setGender("Male");
        veterinarian.gainCash(200,50);
        System.out.println(veterinarian.getName());

        Animal animal5 = new Animal("");
        animal.setName("Linda");
        veterinarian.animal = animal;
        Adopter adopter1 = new Adopter();
        adopter.setName("Simina");
        veterinarian.adopter = adopter;
        Nurse nurse1 = new Nurse();
        nurse.setName("Adriana");
        veterinarian.nurse = nurse;

        System.out.println("Animal name");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);


    }
}
