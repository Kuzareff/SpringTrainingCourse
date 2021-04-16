package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }


////******************************* Lesson 1-11 **************************************************************
//    private ClassicalMusic(){ //Приватный контсруктор класса запрещает создавать новые объекты класса,
//        // поэтому мы испольхуем фабричный паттерн проектирования
//    }
//    //Создание фабричного паттерна
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }
//
//    @Override
//    public String getSong() {
//        return "Hungarian Rhapsody";
//    }
////******************************* Lesson 1-11 End **************************************************************


}
