package com.musicstreaming;

public class VolumeControlDecorator extends PlaybackDecorator {
    public VolumeControlDecorator(Playback playback) {
        super(playback);
    }

    @Override
    public void playMusic() {
        System.out.println("Adjusting volume...");
        decoratedPlayback.playMusic();
    }
}
