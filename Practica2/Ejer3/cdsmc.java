import java.util.List;

public class cdsmc implements IStrategy {
    private int prq;
    private String marca;

    public cdsmc(int prq, String marca) {
        this.prq = prq;
        this.marca = marca;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("<...MUCHOS ...>");
        for (Celulares celulares:tienda){
            if (tienda.size()>5){
                if (celulares.getPrecio()==prq && celulares.getMarca().equals(marca)) {
                    celulares.mostrar();
                }
            }
        }
    }
}
