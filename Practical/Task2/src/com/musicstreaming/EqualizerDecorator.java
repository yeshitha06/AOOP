package com.musicstreaming;

public class EqualizerDecorator extends PlaybackDecorator {
    public EqualizerDecorator(Playback playback) {
        super(playback);
    }

    @Override
    public void playMusic() {
        System.out.println("Applying equalizer settings...");
        decoratedPlayback.playMusic();
    }
}
