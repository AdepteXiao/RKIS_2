package ru.ad.lab2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Главный класс программы
 */
public class App {
    /**
     * Класс для запуска программы
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Race asphaltRace = context.getBean("asphaltRace", Race.class);
        Race rallyRace = context.getBean("rallyRace", Race.class);
        asphaltRace.start();
        rallyRace.start();
    }
}
