import java.util.List;

public class Invierno implements IStrategy {
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("Invierno");
        for (Ropa ropa : tienda) {
            ropa.setStrategyPrice(ropa.getPrecio() + ropa.getPrecio() * 0.1);
            ropa.showInfo();
        }
    }
}
