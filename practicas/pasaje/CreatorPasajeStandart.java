package factoryMethod.practice.pasaje;

public class CreatorPasajeStandart extends Creator{
    @Override
    public IPasaje createProduct() {
        Avion tab = new Avion();
        tab.setMarca("TAB");
        tab.setCapacidad(50);
        tab.setModelo("DC-10-30F");
        tab.setNumeroAsientos(80);
        Lugar d = new Lugar();
        d.setPais("Bolivia");
        d.setCiudad("COCHABAMBA");
        d.setAeropuerto("Aeropuerto Internacional Jorge Wilstermann");
        Lugar o = new Lugar();
        o.setPais("Bolivia");
        o.setCiudad("La Paz");
        o.setAeropuerto("Aeropuerto Internacional de El Alto");
        Pasajero def = new Pasajero();
        def.setNombre("default");
        def.setCi("default");
        PasajeStandart pasaje = new PasajeStandart(o,d,tab,def);
        pasaje.setCostoPasaje(350);
        pasaje.setNumeroVuelo(125);
        return pasaje;
    }
}
