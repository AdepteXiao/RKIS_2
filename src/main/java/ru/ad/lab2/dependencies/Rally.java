package ru.ad.lab2.dependencies;

/**
 * Класс покрытия типа ралли
 */
public class Rally implements Coverage{
    /**
     * Название трассы
     */
    private final String name;
    /**
     * Конструктор класса
     *
     * @param name название
     */
    public Rally(String name) {
        this.name = name;
    }

    /**
     * Метод, выводящий название гонки и название трассы типа ралли
     */
    @Override
    public void rideBy(String race) {
        System.out.println(race + " starts on " + name + " rally track");
    }
}
