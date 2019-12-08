package org.fasttrackit;


import javax.lang.model.element.Name;
import java.util.jar.Attributes;

// inheritance (is-a relationship)
public class Animal {

    private String name;


    private double weight;
    private String namaeOfFavoriteFoods;
    private String nameOfRecreationActivity;
    private int health;
    private int hunger;
    private int moodLevel;
    private double age;
    private int happy;
    private String activity;
    private String favoriteActivity;

    //has-a relationship
    Toy toy;
    Game game;
    AnimalFood animalFood;
    Adopter adopter;
    Veterinarian veterinarian;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public int getHappy() {
        return happy;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNamaeOfFavoriteFoods() {
        return namaeOfFavoriteFoods;
    }

    public void setNamaeOfFavoriteFoods(String namaeOfFavoriteFoods) {
        this.namaeOfFavoriteFoods = namaeOfFavoriteFoods;
    }

    public String getNameOfRecreationActivity() {
        return nameOfRecreationActivity;
    }

    public void setNameOfRecreationActivity(String nameOfRecreationActivity) {
        this.nameOfRecreationActivity = nameOfRecreationActivity;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public void isHappyAnimals() {
        if (getHappy() > 80) ;
    }

}

