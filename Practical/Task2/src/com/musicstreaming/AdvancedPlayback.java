package com.musicstreaming;

public class AdvancedPlayback extends Playback {
    public AdvancedPlayback(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        System.out.println("Starting advanced playback with additional features...");
        musicSource.play();
    }
}
