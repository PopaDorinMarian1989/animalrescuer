package org.fasttrackit;

import java.time.LocalDateTime;

public class Lizard extends Animal {

    private String color;
    private String gender;
    private String breed;
    private String locationOfBirth;

    public Lizard(String name) {
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getLocationOfBirth() {
        return locationOfBirth;
    }

    public void setLocationOfBirth(String locationOfBirth) {
        this.locationOfBirth = locationOfBirth;
    }

    @Override
    public void isHappyAnimals() {
        System.out.println(getName() + " is SSSS ");

    }
}



