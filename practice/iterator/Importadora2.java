import java.util.ArrayList;
import java.util.List;

public class Importadora2 implements IAggregate{
    private List<Vehiculo> lisVehiculos;

    public Importadora2() {
        lisVehiculos = new ArrayList<Vehiculo>();
    }

    public void add(Vehiculo value){
        lisVehiculos.add(value);
    }

    @Override
    public ImportadoraIterator2 createIterator() {
        return new ImportadoraIterator2(lisVehiculos);
    }
}
