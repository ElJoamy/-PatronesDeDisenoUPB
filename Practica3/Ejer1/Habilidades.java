public class Habilidades implements IGame {
    protected IGame game;

    public Habilidades(IGame game) {
        this.game = game;
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
        personaje.showInfo();
    }

    @Override
    public void agregarHabilidad(Personaje personaje) {
    }
}
