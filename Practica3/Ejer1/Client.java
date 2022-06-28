public class Client {
    public static void main (String []args){
        Personaje player = new Personaje("Aiden");

        IGame warcraft = new Warcraft();
        warcraft.crearPersonaje(player);

        warcraft = new AgregarArma(warcraft);
        warcraft.agregarHabilidad(player);

        warcraft = new AgregarEscudo(warcraft);
        warcraft.agregarHabilidad(player);
        
        warcraft = new AgregarArma(warcraft);
        warcraft.agregarHabilidad(player);

        warcraft = new AgregarCuracion(warcraft);
        warcraft.agregarHabilidad(player);
    }
}
