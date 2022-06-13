import java.util.List;

public class Usuarios extends Personas {
    public Usuarios (IComunication comunication){
        super(comunication);
    }

    @Override
    public void send(String msg, List<Integer> personasL) {
        comunication.send(msg, this, personasL);
    }

    @Override
    public void received(String msg) {
        System.out.println("INF=> name: " + getName() + " tipo: " + getTipo());
        System.out.println("Mensaje recibido: " + msg);
    }
}
