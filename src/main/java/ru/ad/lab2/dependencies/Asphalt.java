package ru.ad.lab2.dependencies;

public class Asphalt implements Coverage{

    private final int turnsCount;

    public Asphalt(int turnsCount) {
        this.turnsCount = turnsCount;
    }

    @Override
    public void rideBy(String race) {
        System.out.println(race + " starts on asphalt to make " + turnsCount + " turns" );
    }
}
