package ru.ad.lab2;

import ru.ad.lab2.dependencies.Coverage;
import java.beans.ConstructorProperties;

/**
 * Класс гонки
 */
public class Race {
    /**
     * Название гонки
     */
    private final String name;

    /**
     * Количество машин
     */
    private int carsCount;

    /**
     * Покрытие трассы
     */
    private final Coverage coverage;

    /**
     * Конструктор класса
     *
     * @param name название гонки
     * @param coverage покрытие трассы
     */
    @ConstructorProperties({"name", "coverage"})
    public Race(String name, Coverage coverage) {
        this.name = name;
        this.coverage = coverage;
    }

    /**
     * Сеттер количества машин
     */
    public void setCarsCount(int carsCount) {
        this.carsCount = carsCount;
    }

    /**
     * Метод начала гонки
     */
    public void start() {
        System.out.println(carsCount + " cars!");
        coverage.rideBy(name);
    }
}
