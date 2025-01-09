package com.musicstreaming;

public class BasicPlayback extends Playback {
    public BasicPlayback(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        System.out.println("Starting basic playback...");
        musicSource.play();
    }
}
