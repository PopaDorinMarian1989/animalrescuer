package org.fasttrackit;

public class Adopter {
    private String name;
    private double cash;
    private String namaeOfFavoriteFoods;
    private String nameOfRecreationActivity;
    private boolean moodLevel;
    private double age;
    private String gender;

    // has-a relationship
    Veterinarian veterinarian;
    Nurse nurse;
    Animal animal;
    Activity activity;
    Toy toy;


    public double money(double cash, double spent) {
        System.out.println(name + "is moneyAvailable with " + cash + spent);
        double money = cash - spent;
        System.out.println("Money: " + money);
        cash += money;
        return money;
    }

    public void feedAnimal(Animal animal, AnimalFood food) {
        int i = animal.getHunger();
        if (i > 80) {
            System.out.println(animal.getName() + " is satiated.");
        } else if (food.getName() == animal.getNamaeOfFavoriteFoods() && i < 80 && animal.getHappy() < 95) {
            System.out.println(name + " just added " + food.getName() + " food to " + animal.getName()
                    + ". Because this is favorite meal of " + animal.getName() + " , the happy procentage was increased.");
            animal.setHunger(i + 20);
            animal.setHappy(animal.getHappy() + 5);
        } else {
            System.out.println(name + " just added " + food.getName() + " food to " + animal.getName());
            animal.setHunger(i + 20);
        }
    }

    public void playWithAnimal(Animal animal) {
        int i = animal.getHappy();
        if (i > 80) {
            System.out.println(animal.getName() + " is already happy.");
        } else if (animal.getActivity() == animal.getFavoriteActivity() && i <= 80 && animal.getMoodLevel() <= 90) {
            System.out.println(name + " just played " + animal.getActivity() + " with " + animal.getName()
                    + ". Because this is favorite activity of " + animal.getName() + ", the mood level was increased.");
            animal.setHappy(i + 20);
            animal.setMoodLevel(animal.getMoodLevel() + 10);
        } else {
            System.out.println(name + "just played " + animal.getActivity() + "with " + animal.getName());
            animal.setHappy(i + 20);
        }
    }


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

    public double money(double cash) {
        return money(cash, 100);
    }


}
