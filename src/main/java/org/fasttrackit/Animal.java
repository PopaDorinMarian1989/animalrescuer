package org.fasttrackit;

// inheritance (is-a relationship)
public class Animal {

   private String name;

    public Animal(String name) {
        this.name = name;
    }

    private double weight;
   private String namaeOfFavoriteFoods;
   private String nameOfRecreationActivity;
   private double health;
   private double hunger;
   private boolean moodLevel;
   private double age;

    //has-a relationship
    Activity activity;
    Toy toy;
    Game game;
    AnimalFood animalFood;

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

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public boolean isMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(boolean moodLevel) {
        this.moodLevel = moodLevel;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}



