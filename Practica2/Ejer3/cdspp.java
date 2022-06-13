import java.util.List;

public class cdspp implements IStrategy{
    private String prq;

    public cdspp(String prq) {
        this.prq = prq;
    }

    @Override
    public void execute(List<Celulares> tienda) {
        System.out.println("<...POCOS ...>");
        for (Celulares celulares:tienda){
            if (tienda.size()<5){
                if (celulares.getMarca().equals(prq)) {
                    celulares.mostrar();
                }
            }
        }
    }
}