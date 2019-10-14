package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {


    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;
    private List<AnimalFood> gainFood = new ArrayList<>();
    private Activity[] gainActivity = new Activity[2];

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
