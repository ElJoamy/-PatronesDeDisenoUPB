public class ImportadoraIterator1 implements Iterator {
    private int position;
    private Vehiculo[] lisVehiculos;

    public ImportadoraIterator1(Vehiculo[] lisVehiculos) {
        this.lisVehiculos = lisVehiculos;
    }

    @Override
    public Object next() {
        return lisVehiculos[position++];
    }

    @Override
    public boolean hasNext() {
        return lisVehiculos.length != 0 && position < lisVehiculos.length;
    }
}
