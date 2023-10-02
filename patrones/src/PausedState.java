class PausedState implements State {
    @Override
    public void play() {
        System.out.println("Reanudando la reproducción");
    }

    @Override
    public void pause() {
        System.out.println("Ya se encuentra en pausa");
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo la reproducción");
    }
}
