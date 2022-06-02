public class QA extends Persona {
    private String grado;

    public QA(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getGrado() {
        return grado;
    }

    public QA setGrado(String grado) {
        this.grado = grado;
        return this;
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("INFO> name: " + getName() + " CI: " + getCi() + " Grado: " + getGrado()); 
        System.out.println("INFO> received " + msg);
    }

}
