package com.musicstreaming;

// Simulate a legacy music system that doesn't use the MusicSource interface
class LegacyMusicSystem {
    public void playMusic() {
        System.out.println("Playing music from the legacy system.");
    }
}

// Adapter to adapt the legacy music system to the MusicSource interface
public class LegacyMusicAdapter implements MusicSource {
    private LegacyMusicSystem legacyMusicSystem;

    public LegacyMusicAdapter(LegacyMusicSystem legacyMusicSystem) {
        this.legacyMusicSystem = legacyMusicSystem;
    }

    @Override
    public void play() {
        legacyMusicSystem.playMusic();
    }
}
