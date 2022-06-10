import java.util.List;

public class Primavera implements IStrategy {
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("Primavera");
        for (Ropa ropa : tienda) {
            ropa.setStrategyPrice(ropa.getPrecio());
            ropa.showInfo();
        }
    }
}
