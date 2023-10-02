public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de reproductores de música
        MediaFactory musicFactory = new MusicFactory();
        MediaPlayer musicPlayer = musicFactory.createMediaPlayer();

        // Crear una fábrica de reproductores de video
        MediaFactory videoFactory = new VideoFactory();
        MediaPlayer videoPlayer = videoFactory.createMediaPlayer();

        // Reproducir música
        System.out.println("Reproduciendo música:");
        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.play();
        musicPlayer.stop();

        // Reproducir video
        System.out.println("\nReproduciendo video:");
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.play();
        videoPlayer.stop();
    }
}
