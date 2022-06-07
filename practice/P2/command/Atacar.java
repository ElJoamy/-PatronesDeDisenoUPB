public class Atacar implements ICommand {
    private Juego juego;
    
    public Atacar(Juego juego) {
        this.juego = juego;
    }
    
    @Override
    public void execute() {
        System.out.println("<...Preparacion de ataque al enemigo...>");
        juego.msgAtacar();
    }
}