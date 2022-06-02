import java.util.Stack;

public class ImportadoraIterator4 implements Iterator {
    private Stack<Vehiculo> lisVehiculos;
    private int position;

    public ImportadoraIterator4(Stack<Vehiculo> lisVehiculos) {
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
