package org.fasttrackit;

public class Adopter {
   private String name;
   private double cash;
   private String namaeOfFavoriteFoods;
   private String nameOfRecreationActivity;
   private double health;
   private double hunger;
   private boolean moodLevel;
   private double age;
   private String gender;
    // has-a relationship
    Veterinarian veterinarian;
    Nurse nurse;
    Animal animal;
    Activity activity;
    Toy toy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double money(double cash, double spent) {

        System.out.println(name + "is moneyAvailable with " + cash + spent);
        double money = cash - spent;
        System.out.println("Money: " + money);
        cash += money;


        return money;

    }


}
