package factoryMethod.practice.pasaje;

public class PasajeSolidario implements IPasaje{
    private int nVuelo;
    private Lugar d = new Lugar();
    private Lugar o = new Lugar();
    private Pasajero pasajero = new Pasajero();
    private Avion avion = new Avion();
    private String numeroAsiento;
    private int costoPasaje;
    private int descuento;
    private String motivoDescuento;

    public PasajeSolidario(Lugar d, Lugar o, Pasajero pasajero, Avion avion){
        this.d = d;
        this.o = o;
        this.avion = avion;
        this.pasajero = pasajero;
    }

    @Override
    public void showInfo() {
        System.out.println("-------------------------PASAJE SOLIDARIO-------------------------");
        System.out.println("Numero de Vuelo: "+nVuelo);
        System.out.println("Destino: ");
        System.out.println("   - Pais: "+d.getPais());
        System.out.println("   - Ciudad: "+d.getCiudad());
        System.out.println("   - Aeropuerto: "+d.getAeropuerto());
        System.out.println("Origen: ");
        System.out.println("   - Pais: "+o.getPais());
        System.out.println("   - Ciudad: "+o.getCiudad());
        System.out.println("   - Aeropuerto: "+o.getAeropuerto());
        System.out.println("Avion: ");
        System.out.println("   - Marca: "+avion.getMarca());
        System.out.println("   - Capacidad: "+avion.getCapacidad());
        System.out.println("   - Modelo: "+avion.getModelo());
        System.out.println("   - Numero de Asientos: "+avion.getNumeroAsientos());
        System.out.println("Pasajero: ");
        System.out.println("   - Nombre: "+pasajero.getNombre());
        System.out.println("   - CI: " +pasajero.getCi());
        System.out.println("Numero de Asiento: "+numeroAsiento);
        System.out.println("Costo de Pasaje: "+costoPasaje);
        System.out.println("Descuento: "+descuento+ "%");
        System.out.println("Motivo de Descuento: "+motivoDescuento);
        System.out.println("----------------------------------------------------------------");
    }

    public int getNumeroVuelo() {
        return nVuelo;
    }

    public void setNumeroVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    public Lugar getDestino() {
        return d;
    }

    public void setDestino(Lugar d) {
        this.d = d;
    }

    public Lugar getOrigen() {
        return o;
    }

    public void setOrigen(Lugar o) {
        this.o = o;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

}
