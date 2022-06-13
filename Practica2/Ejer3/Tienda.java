import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private IStrategy strategy;
    private List<Celulares> cL=new ArrayList<>();
    public Tienda(){
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void addCelular(Celulares celulares){
        cL.add(celulares);
    }
    public void start(){
        strategy.execute(cL);
    }
}
