package com.musicstreaming;

public class OnlineMusicSource implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing music from an online streaming service.");
    }
}
