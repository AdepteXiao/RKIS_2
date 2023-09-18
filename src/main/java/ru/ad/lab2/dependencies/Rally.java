package ru.ad.lab2.dependencies;

public class Rally implements Coverage{
    private final String name;

    public Rally(String name) {
        this.name = name;
    }

    @Override
    public void rideBy(String race) {
        System.out.println(race + " starts on " + name + " rally track");
    }
}
