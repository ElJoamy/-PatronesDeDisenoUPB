import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private  List<Ropa> listRopa = new ArrayList<>();
    private IStrategy strategy;

    public Tienda(){}
    
    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void addRopa(Ropa ropa) {
        listRopa.add(ropa);
    }

    public void startStrategy() {
        strategy.execute(listRopa);
    }
}
