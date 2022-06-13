import java.util.List;

public class cdsmp implements IStrategy {
    private String prq;

    public cdsmp(String prq) {
        this.prq = prq;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("<...MUCHOS ...>");
        for (Celulares celulares:tienda){
            if (tienda.size()>5){
                if (celulares.getMarca().equals(prq)) {
                    celulares.mostrar();
                }
            }
        }
    }
}
