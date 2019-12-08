package org.fasttrackit;

import java.time.LocalDateTime;

public class Cat extends Animal {
    private String color;
    private String gender;
    private String breed;
    private String size;
    private int waterProcentage;
    private int pawsCount;

    public Cat(String name) {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWaterProcentage() {
        return waterProcentage;
    }

    public void setWaterProcentage(int waterProcentage) {
        this.waterProcentage = waterProcentage;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    @Override
    public void isHappyAnimals() {
        System.out.println(getName() + " pores ");

    }
}
