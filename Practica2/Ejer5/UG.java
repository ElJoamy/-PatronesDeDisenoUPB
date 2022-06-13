public class UG implements IUser{
    String prefer;
    Persona persona;

    public UG(String notificacion, Persona persona) {
        this.prefer = notificacion;
        this.persona = persona;
    }

    @Override
    public void update(String msg) {
        System.out.println("<... Notificacion: " + msg + " ...>");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Preferencia: "+ prefer);
    }

    @Override
    public String getPrefNoti() {
        return prefer;
    }

    public Persona getPersona() {
        return persona;
    }
}
