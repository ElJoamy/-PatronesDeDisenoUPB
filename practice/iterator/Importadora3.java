import java.util.Vector;

public class Importadora3 implements IAggregate {
    private Vector<Vehiculo> lisVehiculos;

    public Importadora3() {
        lisVehiculos = new Vector<Vehiculo>();
    }

    public void add(Vehiculo value) {
        lisVehiculos.add(value);
    }

    @Override
    public ImportadoraIterator3 createIterator() {
        return new ImportadoraIterator3(lisVehiculos);
    }
}
