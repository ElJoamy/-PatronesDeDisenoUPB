import java.util.List;

public class Verano implements IStrategy {
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("Verano");
        for (Ropa ropa : tienda) {
            ropa.setStrategyPrice(ropa.getPrecio() - ropa.getPrecio() * 0.1);
            ropa.showInfo();
        }
    }
}
