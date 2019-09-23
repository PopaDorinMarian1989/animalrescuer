package org.fasttrackit;

public class Veterinarian {

    private String name;
    private String specialization;
    private String namaeOfFavoriteFoods;
    private double priceConsultation;
    private double age;
    private int cabinet;
    private String gender;
    //has-a relationship
    Nurse nurse;
    Adopter adopter;
    Animal animal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getNamaeOfFavoriteFoods() {
        return namaeOfFavoriteFoods;
    }

    public void setNamaeOfFavoriteFoods(String namaeOfFavoriteFoods) {
        this.namaeOfFavoriteFoods = namaeOfFavoriteFoods;
    }

    public double getPriceConsultation() {
        return priceConsultation;
    }

    public void setPriceConsultation(double priceConsultation) {
        this.priceConsultation = priceConsultation;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double gainCash(double treatment, double priceConsultation) {
        System.out.println(name + "is getMoney with" + treatment + priceConsultation);
        double gainCash = treatment + priceConsultation;
        System.out.println("GainCash" + gainCash);
        priceConsultation += gainCash;

        return gainCash;

    }


}
