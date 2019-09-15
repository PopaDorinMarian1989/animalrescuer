package org.fasttrackit;

public class Veterinarian {

    String name;
    String specialization;
    String namaeOfFavoriteFoods;
    double priceConsultation;
    double age;
    int cabinet;
    String gender;
    //has-a relationship
    Nurse nurse;
    Adopter adopter;
    Animal animal;

    public double gainCash (double treatment,double priceConsultation ){
        System.out.println(name +"is getMoney with" +treatment + priceConsultation);
        double gainCash = treatment +   priceConsultation;
        System.out.println("GainCash"  +gainCash);
        priceConsultation += gainCash;

        return gainCash;

    }


}
