package com.musicstreaming;

public class LocalMusicSource implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing music from local files.");
    }
}
