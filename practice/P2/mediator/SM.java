public class SM extends Persona {
    private String certificaciones;

    public SM(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("INFO> name: " + getName() + " CI: " + getCi() + " Certificaciones: " + getCertificaciones()); 
        System.out.println("INFO> received " + msg);
    }

}
