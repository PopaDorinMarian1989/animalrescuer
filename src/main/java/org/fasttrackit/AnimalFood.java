package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {

    String name;
    double price;
    double amount;
    boolean availability;
    LocalDate expirationDate;

    //has-a relationship
    Animal animal;

}
