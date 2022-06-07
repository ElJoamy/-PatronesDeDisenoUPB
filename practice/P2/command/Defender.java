public class Defender implements ICommand {
    private Juego juego;
    
    public Defender(Juego juego) {
        this.juego = juego;
    }
    
    @Override
    public void execute() {
        System.out.println("<...El comando de defense se esta implementando...>");
        juego.msgDefender();
    }
}
