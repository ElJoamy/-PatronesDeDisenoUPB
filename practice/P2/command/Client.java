public class Client {
    public static void main(String[] args) {
        Juego juego = new Juego("Metal Slug");
        System.out.println("Juego: " + juego.getNombre());        
        Controls controls = new Controls();
        controls.addCommand(new Disparar(juego));
        controls.addCommand(new Defender(juego));
        controls.addCommand(new Atacar(juego));
        controls.addCommand(new Disparar(juego));
        controls.addCommand(new Disparar(juego));
        controls.addCommand(new Defender(juego));
        controls.addCommand(new Atacar(juego));

        controls.runCommand();
    }
}