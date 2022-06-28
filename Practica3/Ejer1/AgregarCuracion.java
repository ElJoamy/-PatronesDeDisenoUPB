public class AgregarCuracion extends Habilidades {
    public AgregarCuracion(IGame game) {
        super(game);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("<---Añadiendo pociones de curacion al personaje!--->");
        double nHealth = personaje.getPuntosRegeneracion() + 80;
        personaje.setPuntosRegeneracion(nHealth);
        personaje.showInfo();
    }
}
