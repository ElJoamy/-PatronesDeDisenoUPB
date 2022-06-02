import java.util.List;

public class ImportadoraIterator2 implements Iterator {
    private List<Vehiculo> lisVehiculos;
    private int position;

    public ImportadoraIterator2(List<Vehiculo> lisVehiculos) {
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
