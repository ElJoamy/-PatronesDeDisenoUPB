import java.util.List;

public class cdspc implements IStrategy {
    private int prq;
    private String marca;

    public cdspc(int prq, String marca) {
        this.prq = prq;
        this.marca = marca;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("<...POCOS ...>");
        for (Celulares celulares:tienda){
            if (tienda.size()<5){
                if (celulares.getPrecio()==prq && celulares.getMarca().equals(marca)) {
                    celulares.mostrar();
                }
            }
        }
    }
}
