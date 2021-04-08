package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){ //Приватный контсруктор класса запрещает создавать новые объекты класса,
        // поэтому мы испольхуем фабричный паттерн проектирования
    }
    //Создание фабричного паттерна
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
