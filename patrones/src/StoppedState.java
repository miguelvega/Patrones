class StoppedState implements State {
    @Override
    public void play() {
        System.out.println("Iniciando la reproducción");
    }

    @Override
    public void pause() {
        System.out.println("No se puede poner en pausa, la reproducción está detenida");
    }

    @Override
    public void stop() {
        System.out.println("La reproducción ya está detenida");
    }
}
