package factoryMethod.practice.pasaje;

public class CreatorPasajeInfante extends Creator{
    @Override
    public IPasaje createProduct() {
        Avion boa = new Avion();
        boa.setMarca("BOA");
        boa.setCapacidad(225);
        boa.setModelo("Boeing 767-300ER");
        boa.setNumeroAsientos(225);
        Lugar d = new Lugar();
        d.setPais("Bolivia");
        d.setCiudad("Cobija");
        d.setAeropuerto("Aeropuerto Internacional Aníbal Arab Fadul");
        Lugar o = new Lugar();
        o.setPais("Bolivia");
        o.setCiudad("Santa Cruz de la Sierra");
        o.setAeropuerto("Trompillo");
        Pasajero def = new Pasajero();
        def.setNombre("default");
        def.setCi("default");
        PasajeInfante pasaje = new PasajeInfante(o,d,def,boa);
        pasaje.setCostoEspecial(145);
        pasaje.setNumeroVuelo(123);
        return pasaje;
    }
}
