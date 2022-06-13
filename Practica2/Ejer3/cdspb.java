import java.util.List;

public class cdspb implements IStrategy {
    private int prq;

    public cdspb(int prq) {
        this.prq = prq;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("<...POCOS...>");
        for (Celulares celulares:tienda){
            if (tienda.size()<5){
                if (celulares.getPrecio()==prq) {
                    celulares.mostrar();
                }
            }
        }
    }
}
