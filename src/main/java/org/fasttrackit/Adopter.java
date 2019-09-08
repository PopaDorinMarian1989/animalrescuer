package org.fasttrackit;

public class Adopter {
    String name;
    double cash;
    String namaeOfFavoriteFoods;
    String nameOfRecreationActivity;
    double health;
    double hunger;
    boolean moodLevel;
    double age;

    public double money(double cash, double spent){

        System.out.println(name + "is moneyAvailable with " + cash + spent);
        double money = cash - spent;
        System.out.println("Money: " + money);


        return money;

    }


}
