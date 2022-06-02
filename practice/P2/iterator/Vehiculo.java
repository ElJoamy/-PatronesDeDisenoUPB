public class Vehiculo {
    private String modelo;
    private String costo;
    private String tipo;
    private String nAsientos;

    public Vehiculo(){}
    
    public Vehiculo(String modelo, String costo, String tipo, String nAsientos){
        this.modelo = modelo;
        this.costo = costo;
        this.tipo = tipo;
        this.nAsientos = nAsientos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(String nAsientos) {
        this.nAsientos = nAsientos;
    }

}
