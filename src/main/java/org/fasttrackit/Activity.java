package org.fasttrackit;

public class Activity {
    private String name;
    private String place;

    public Activity(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public Activity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Activity(String name) {
        this.name = name;
    }
}
