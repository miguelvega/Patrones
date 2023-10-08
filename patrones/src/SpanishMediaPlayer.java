// Interfaz para el reproductor de medios
public interface SpanishMediaPlayer {
    void reproducir();
    void pausar();
    void detener();

    State obtenerEstado();
}
