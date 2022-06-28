public class Warcraft implements IGame {

    @Override
    public void crearPersonaje(Personaje personaje) {
        System.out.println("<---Creando al personaje--->");
        personaje.setPorcentajeArmadura(1);
        personaje.setArmas("None");
        personaje.setNivel(1);
        personaje.setPuntosAtaque(1);
        personaje.setPuntosRegeneracion(1);
        personaje.setPuntosDefensa(1);
        personaje.showInfo();
    }

    @Override
    public void agregarHabilidad(Personaje personaje) {
    }
}
