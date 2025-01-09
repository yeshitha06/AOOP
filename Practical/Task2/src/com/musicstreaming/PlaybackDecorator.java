package com.musicstreaming;

public abstract class PlaybackDecorator extends Playback {
    protected Playback decoratedPlayback;

    public PlaybackDecorator(Playback playback) {
        super(playback.musicSource);
        this.decoratedPlayback = playback;
    }

    @Override
    public abstract void playMusic();
}
