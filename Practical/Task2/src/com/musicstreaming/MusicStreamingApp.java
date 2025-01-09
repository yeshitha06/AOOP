package com.musicstreaming;

public class MusicStreamingApp {
    public static void main(String[] args) {
        // Local music source
        MusicSource localMusic = new LocalMusicSource();

        // Online streaming source
        MusicSource onlineMusic = new OnlineMusicSource();

        // Radio station source
        MusicSource radioMusic = new RadioMusicSource();

        // Legacy music system
        LegacyMusicSystem legacyMusicSystem = new LegacyMusicSystem();
        MusicSource legacyMusic = new LegacyMusicAdapter(legacyMusicSystem);

        // Basic playback for local music
        Playback localPlayback = new BasicPlayback(localMusic);
        localPlayback.playMusic();

        // Advanced playback with equalizer for online music
        Playback onlinePlayback = new EqualizerDecorator(new AdvancedPlayback(onlineMusic));
        onlinePlayback.playMusic();

        // Advanced playback with volume control for radio music
        Playback radioPlayback = new VolumeControlDecorator(new AdvancedPlayback(radioMusic));
        radioPlayback.playMusic();

        // Basic playback for legacy music system
        Playback legacyPlayback = new BasicPlayback(legacyMusic);
        legacyPlayback.playMusic();
    }
}
