import java.util.Vector;

public class ImportadoraIterator3 implements Iterator {
    private Vector<Vehiculo> lisVehiculos;
    private int position;

    public ImportadoraIterator3(Vector<Vehiculo> lisVehiculos) {
        this.lisVehiculos = lisVehiculos;
    }

    @Override
    public Object next() {
        return lisVehiculos.get(position++);
    }

    @Override
    public boolean hasNext() {
        return lisVehiculos.size() != 0 && position < lisVehiculos.size();
    }
}