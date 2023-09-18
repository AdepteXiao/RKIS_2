package ru.ad.lab2;

import ru.ad.lab2.dependencies.Coverage;
import java.beans.ConstructorProperties;

public class Race {
    private final String name;

    private int carsCount;

    private final Coverage coverage;

    @ConstructorProperties({"name", "coverage"})
    public Race(String name, Coverage coverage) {
        this.name = name;
        this.coverage = coverage;
    }

    public void setCarsCount(int carsCount) {
        this.carsCount = carsCount;
    }

    public void start() {
        System.out.println(carsCount + " cars!");
        coverage.rideBy(name);
    }
}
