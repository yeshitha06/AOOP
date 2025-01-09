package com.musicstreaming;

public class RadioMusicSource implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing music from a radio station.");
    }
}
