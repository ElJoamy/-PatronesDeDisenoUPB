public class CreatorKitEscolar extends Creator {
    @Override
    public KitEscolar createKit() {
        Mochila mochila = new Mochila();
        mochila.setSize("Pequeña");
        mochila.setNroBolsillos(2);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Blanco");
        deportivo.setTalla("M");
        deportivo.setNroDePrendas(2);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("carpeta");
        cuaderno.setNroDeHojas(50);

        KitEscolar kit1 = new KitEscolar(mochila, deportivo, cuaderno);

        return kit1;
    }
}

