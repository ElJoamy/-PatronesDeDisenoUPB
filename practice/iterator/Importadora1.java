public class Importadora1 implements IAggregate {
    private int position;
    private Vehiculo[] lisVehiculos;

    public Importadora1() {
        lisVehiculos = new Vehiculo[1];
    }

    public void add(Vehiculo value){
        lisVehiculos[position] =value;
        position++;
    }

    @Override
    public ImportadoraIterator1 createIterator() {
        return new ImportadoraIterator1(lisVehiculos);
    }
}
