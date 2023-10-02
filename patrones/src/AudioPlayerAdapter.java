// Adaptador para reproducir archivos de audio utilizando el reproductor de música
class AudioPlayerAdapter implements MediaPlayer {
    private MusicPlayer musicPlayer;

    public AudioPlayerAdapter() {
        this.musicPlayer = new MusicPlayer();
    }

    @Override
    public void play() {
        musicPlayer.play();
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void stop() {
        musicPlayer.stop();
    }

    @Override
    public State getState() {
        return musicPlayer.getState();
    }
}
