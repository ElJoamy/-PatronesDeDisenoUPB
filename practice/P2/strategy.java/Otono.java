import java.util.List;

public class Otono implements IStrategy {
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("Otono");
        for (Ropa ropa : tienda) {
            ropa.setStrategyPrice(ropa.getPrecio() - ropa.getPrecio() * 0.5);
            ropa.showInfo();
        }
    }
}
