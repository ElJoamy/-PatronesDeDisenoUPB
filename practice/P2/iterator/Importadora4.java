import java.util.Stack;

public class Importadora4 implements IAggregate {
    private Stack<Vehiculo> lisVehiculos;

    public Importadora4() {
        lisVehiculos = new Stack<Vehiculo>();
    }

    public void add(Vehiculo value) {
        lisVehiculos.add(value);
    }

    @Override
    public ImportadoraIterator4 createIterator() {
        return new ImportadoraIterator4(lisVehiculos);
    }
}

