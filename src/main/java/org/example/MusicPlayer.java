package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    //@Autowired
    //@Qualifier("rockMusic") //Аннотация Квалифае позволяет оперделить какую зависимотсь включать, если есть больше 1 похожей ссылки
//    private Music music1;
//    private Music music2;
//
//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }
//
//    public String playMusic() {
//        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//    }
//    private List<Music> musicList = new ArrayList<>();
//
//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public MusicPlayer() {
//    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    //IoC
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public void playMusicList() {
//        for(Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
//
//    public void playMusic() {
//            System.out.println(music.getSong());
//    }

//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//
//    @Autowired //Автоматическое внедрение зависимостей
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre){
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if(genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }

    }
}

