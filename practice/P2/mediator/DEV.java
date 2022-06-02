public class DEV extends Persona{
    private String lenguaje;

    public DEV(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("INFO> name: " + getName() + " CI: " + getCi() + " Lenguaje: " + getLenguaje()); 
        System.out.println("INFO> received " + msg);
    }
}