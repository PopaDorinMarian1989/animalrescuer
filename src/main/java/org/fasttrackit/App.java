package org.fasttrackit;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static Date LocalDateTime;

    public static void main(String[] args) {

        Animal animal = new Animal("");
        animal.setName("Rex");
        animal.setNamaeOfFavoriteFoods("Chap");
        animal.setNameOfRecreationActivity("Fetc");
        animal.setAge(3);
        animal.setHappy(86);

        Adopter adopter3 = new Adopter();
        adopter3.setName("Vasile");
        animal.adopter = adopter3;

        Veterinarian veterinarian2 = new Veterinarian();
        veterinarian2.setName("Alin");
        animal.veterinarian = veterinarian2;

        Game game = new Game();
        game.start();
        animal.game = game;

        Toy toy = new Toy();
        toy.setName("Frisbee");
        toy.setAmount(3);
        toy.setPrice(130);
        animal.toy = toy;

        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Chap");
        animalFood.setPrice(13);
        animalFood.setAmount(1);
        animalFood.setExpirationDate(2020, 20, 2);
        animal.animalFood = animalFood;
        System.out.println("Animal object: " + animal.toString());

        System.out.println(animal.getName());
        System.out.println(animal.getHealth());
        System.out.println(animal.getHunger());
        System.out.println(animal.getMoodLevel());
        System.out.println(animal.getNameOfRecreationActivity());
        System.out.println(animal.getHappy());
        System.out.println(animal.getNamaeOfFavoriteFoods());
        System.out.println(animal.getAge());
        System.out.println(adopter3.getName());
        System.out.println(veterinarian2.getName());
        System.out.println(game.getClass());
        System.out.println(toy.getName());
        System.out.println(toy.getAmount());
        System.out.println(toy.getPrice());
        System.out.println(animalFood.getName());
        System.out.println(animalFood.getPrice());
        System.out.println(animalFood.getAmount());
        System.out.println(animalFood.getExpirationDate());
        System.out.println(animalFood.isAvailability());
        System.out.println(animal.toy);
        System.out.println(animal.game);
        System.out.println(animal.animalFood);
        System.out.println(animal.adopter);
        System.out.println(animal.veterinarian);


        Animal animal2 = new Animal("");
        animal2.setName("Titica");
        animal2.setNamaeOfFavoriteFoods("Pedigree");
        animal2.setNameOfRecreationActivity("Frisbee");
        animal2.setAge(5);
        animal2.setWeight(5);

        Game game2 = new Game();
        animal2.game = game2;

        Toy toy2 = new Toy();
        toy.setName("Ball");
        toy.setAmount(5);
        toy.setPrice(150);
        animal2.toy = toy2;
//        animal.name = "Ulise";
//        animal.name = null;
        AnimalFood animalFood2 = new AnimalFood();
        animalFood.setName("Kaufland");
        animalFood.setPrice(2);
        animalFood.setAmount(2);
        animalFood.setExpirationDate(2021, 21, 2);
        animal.animalFood = animalFood2;

        //concatenation
        //System.out.println("Animal2 name: " + animal2.getName());
        //System.out.println("Animal1 name: " + animal.getName());

        System.out.println(animal2.getName());
        System.out.println(animal2.getHealth());
        System.out.println(animal2.getMoodLevel());
        System.out.println(animal2.getNameOfRecreationActivity());
        System.out.println(animal2.getAge());
        System.out.println(animal2.getWeight());
        System.out.println(animal2.getNamaeOfFavoriteFoods());
        System.out.println(game2.getClass());
        System.out.println(toy2.getName());
        System.out.println(toy2.getAmount());
        System.out.println(toy2.getPrice());
        System.out.println(animalFood2.getName());
        System.out.println(animalFood2.getPrice());
        System.out.println(animalFood2.getAmount());
        System.out.println(animalFood2.getExpirationDate());
        System.out.println(animalFood2.isAvailability());
        System.out.println(animal2.toy);
        System.out.println(animal2.game);
        System.out.println(animal2.animalFood);


        Animal animal3 = new Animal("");
        animal3.setName("Luci");
        animal3.setNamaeOfFavoriteFoods("Worms");
        animal3.setNameOfRecreationActivity("Sleep");
        animal3.setAge(1);
        animal3.setWeight(1);

        Game game3 = new Game();
        animal3.game = game3;

        AnimalFood animalFood3 = new AnimalFood();
        animalFood.setName("Issa");
        animalFood.setPrice(10);
        animalFood.setAmount(5);
        animalFood.setExpirationDate(2022, 22, 2);
        animal.animalFood = animalFood2;

        Toy toy3 = new Toy();
        toy.setName("SoccerBall");
        toy.setAmount(3);
        toy.setPrice(45);
        animal3.toy = toy3;

        System.out.println(animal3.getHealth());
        System.out.println(animal3.getHunger());
        System.out.println(animal3.getMoodLevel());
        System.out.println(animal3.getNameOfRecreationActivity());
        System.out.println(animal3.getAge());
        System.out.println(animal3.getWeight());
        System.out.println(animal3.getNamaeOfFavoriteFoods());
        System.out.println(toy3.getName());
        System.out.println(toy3.getAmount());
        System.out.println(toy3.getPrice());
        System.out.println(game3.getClass());
        System.out.println(animalFood3.getName());
        System.out.println(animalFood3.getPrice());
        System.out.println(animalFood3.getAmount());
        System.out.println(animalFood3.getExpirationDate());
        System.out.println(animalFood3.isAvailability());
        System.out.println(animal3.toy);
        System.out.println(animal3.game);
        System.out.println(animal3.animalFood);


        Animal dog = new Dog("Thor");
        dog.setHappy(35);
        dog.isHappyAnimals();


        System.out.println(dog.getName());

        Animal cat = new Cat("Mitzi");
        cat.setHappy(95);
        cat.isHappyAnimals();


        System.out.println(cat.getName());

        Animal lizard = new Lizard("Lizuca");
        lizard.setHappy(50);
        lizard.isHappyAnimals();

        System.out.println(lizard.getName());

        Adopter adopter = new Adopter();
        adopter.setName("Dorin");
        adopter.setCash(2500);
        adopter.setNamaeOfFavoriteFoods("Steak");
        adopter.setNameOfRecreationActivity("Gym");
        adopter.setAge(30);
        adopter.setGender("Male");

        Toy toy4 = new Toy();
        toy.setName("Bone");
        toy.setAmount(4);
        toy.setPrice(120);
        adopter.toy = toy;

        Activity activity = new Activity();
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

        adopter.money(300, 100);

        System.out.println(adopter.getName());
        System.out.println(adopter.isMoodLevel());
        System.out.println(adopter.getNameOfRecreationActivity());
        System.out.println(adopter.getAge());
        System.out.println(adopter.getGender());
        System.out.println(adopter.getCash());
        System.out.println(adopter.getNamaeOfFavoriteFoods());
        System.out.println(activity.getName());
        System.out.println(activity.getPlace());
        System.out.println(animal4.getName());
        System.out.println(veterinarian1.getName());
        System.out.println(nurse.getName());
        System.out.println(nurse.getAge());
        System.out.println(nurse.getHealth());
        System.out.println(nurse.getGender());
        System.out.println(toy4.getName());
        System.out.println(toy4.getPrice());
        System.out.println(toy4.getAmount());
        System.out.println(adopter.activity);
        System.out.println(adopter.animal);
        System.out.println(adopter.nurse);
        System.out.println(adopter.toy);
        System.out.println(adopter.veterinarian);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Adrian");
        veterinarian.setSpecialization("DomesticAnimal");
        veterinarian.setNamaeOfFavoriteFoods("Pizza");
        veterinarian.setPriceConsultation(100);
        veterinarian.setAge(33);
        veterinarian.setCabinet(1);
        veterinarian.setGender("Male");
        veterinarian.gainCash(200, 50);

        Nurse nurse1 = new Nurse();
        nurse1.setName("Alina");
        nurse1.setGender("Female");
        nurse1.setAge(21);
        veterinarian.nurse = nurse1;

        Adopter adopter1 = new Adopter();
        adopter.setName("Simona");
        veterinarian.adopter = adopter;

        Animal animal5 = new Animal("");
        animal.setName("Linda");
        veterinarian.animal = animal;

        System.out.println(veterinarian.getName());
        System.out.println(veterinarian.getSpecialization());
        System.out.println(veterinarian.getNamaeOfFavoriteFoods());
        System.out.println(veterinarian.getPriceConsultation());
        System.out.println(veterinarian.getAge());
        System.out.println(veterinarian.getCabinet());
        System.out.println(veterinarian.getGender());
        System.out.println(adopter1.getName());
        System.out.println(animal5.getName());
        System.out.println(nurse1.getName());
        System.out.println(nurse1.getHealth());
        System.out.println(nurse1.getGender());
        System.out.println(nurse1.getAge());
        System.out.println(veterinarian.nurse);
        System.out.println(veterinarian.adopter);
        System.out.println(veterinarian.animal);

        System.out.println("Animal name");
        Scanner scanner = new Scanner(System.in);
        String dogBarking = scanner.nextLine();
        System.out.println("Input from user: " + dogBarking);
        animal.isHappyAnimals();
        EntertaimentActivity entertaimentActivity = new EntertaimentActivity();
                entertaimentActivity.setName("Football");


    }

    public static Date getLocalDateTime() {
        return LocalDateTime;
    }

    public static void setLocalDateTime(Date localDateTime) {
        LocalDateTime = localDateTime;

        Game game = new Game();
        game.start();
    }
}
