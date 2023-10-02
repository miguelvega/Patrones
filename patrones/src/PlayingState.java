class PlayingState implements State {
    @Override
    public void play() {
        System.out.println("Ya se está reproduciendo");
    }

    @Override
    public void pause() {
        System.out.println("Pausando la reproducción");
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo la reproducción");
    }
}
