package com.musicstreaming;

public class VolumeControlDecorator extends MusicPlayerDecorator {
    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume level...");
    }

}
