import java.util.List;

public class Desarrollador extends Persona {
    public Desarrollador(IComunication comunication) {
        super(comunication);
    }
    
    @Override
    public void send(String msg, List<Integer> personasL) {
        comunication.send(msg, this, personasL);
    }

    @Override
    public void received(String msg) {
        System.out.println("INF> name: " + getName() + " no:" + getNo() + " tipo:" + getTipo());
        System.out.println("INF> received: " + msg);
    }
}
