package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {


    private Adopter adopter;
    private  Dog dog;
    private Animal animal;
    private Veterinarian veterinarian;
    private List<AnimalFood> gainFood = new ArrayList<>();
    private Activity[] gainActivity = new Activity[2];
    private AnimalFood animalFood;
    private AnimalFood[] availableanimalFood;
    private Activity[] availableActivities;

    private String initAdopter() {
        System.out.println(" Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is:" + name);
        try {
            name = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name");
            return initAdopter();
        }
        System.out.println("You entered name");
        return name;

    }

    private void nameAnimal() {
        System.out.println("Enter animal name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Animal name is: " + name);
        try {
            name = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name");

        }
    }

    private void showavailableAnimalFood() {

        System.out.println("availableanimalFood");
        for (AnimalFood animalFood : availableanimalFood) {
            System.out.println(AnimalFood.getName());
        }
    }

    public void initAnimal() {
        Animal animal = new Animal();
        animal.setName("Rex");
    }

    private void initAnimalFood() {
        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Chap");

        AnimalFood animalFood1 = new AnimalFood();
        animalFood1.setName("Pedigree");



    }
    private void initActivities() {
        EntertaimentActivity acttivity = new EntertaimentActivity();
        acttivity.setName("Fetch");

        EntertaimentActivity activity1 = new EntertaimentActivity();
        activity1.setName("Fresbee");

        availableActivities[0] = (Activity) acttivity;
        availableActivities[1] = (Activity) activity1;
    }


    private void initrequireFeeding() {
        System.out.println("Feed animal");
        Scanner scanner = new Scanner(System.in);
        String getfood = scanner.nextLine();
        System.out.println("Your food is:" + availableanimalFood());
        {
            try {
                getfood = scanner.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Please enter valid name");

                for (AnimalFood animalFood : availableanimalFood) ;
                if (availableanimalFood != null) {
                    System.out.println("You could chose other type of food");
                }


            }
        }
    }

    private String availableanimalFood() {
        return null;
    }


    public void start() {
        initActivity();
        displayActivity();
        initFood();
        displayFood();

    }

    private void initActivity() {
        System.out.println("Available activity is: ");
        Activity activity1 = new Activity();
        activity1.setName("Running");
        gainActivity[0] = activity1;

        Activity activity2 = new Activity();
        activity2.setName("Sleep");
        gainActivity[1] = activity2;
    }

    private void displayActivity() {
        for (int i = 0; i < gainActivity.length; i++) {
            System.out.println(gainActivity[i].getName());

        }
    }

    private void initFood() {
        int foodCount = 2;
        AnimalFood food1 = new AnimalFood();
        food1.setName("Chappy");
        gainFood.add(food1);
        AnimalFood food2 = new AnimalFood();
        food2.setName("Lizard food");
        gainFood.add(food2);

    }

    private void displayFood() {
        System.out.println("Available food is: ");
        for (AnimalFood food : gainFood) {
            System.out.println(food.getName());
        }
    }


}
