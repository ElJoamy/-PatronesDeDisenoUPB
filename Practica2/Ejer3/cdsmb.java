import java.util.List;

public class cdsmb implements IStrategy {
    private int prq;

    public cdsmb(int prq) {
        this.prq = prq;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("<...MUCHOS ...>");
        for (Celulares celulares:tienda){
            if (tienda.size()>5){
                if (celulares.getPrecio()==prq) {
                    celulares.mostrar();
                }
            }
        }
    }
}
