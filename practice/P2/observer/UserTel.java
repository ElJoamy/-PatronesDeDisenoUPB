public class UserTel implements IUser{
    String tipoDeNotificacion;
    Persona persona;

    public UserTel(String tipoDeNotificacion, Persona persona) {
        this.tipoDeNotificacion = tipoDeNotificacion;
        this.persona = persona;
    }

    @Override
    public String getOpconNotify() {
        return tipoDeNotificacion;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public void update1(String msg, Notify newNotify) {
        System.out.println("<---Notificacion: " + msg + "--->");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Tipo de notificacion: " + tipoDeNotificacion);
        newNotify.showInfo1();
    }

    @Override
    public void update2(String msg, Notify newNotify) {
        System.out.println("<---Notificacion: " + msg + "--->");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Tipo de notificacion: " + tipoDeNotificacion);
        newNotify.showInfo3();
    }

    @Override
    public void update3(String msg, Notify newNotify) {
        System.out.println("<---Notificacion: " + msg + "--->");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Tipo de notificacion: " + tipoDeNotificacion);
        newNotify.showInfo2();
    }

    @Override
    public void update4(String msg, Notify newNotify) {
        System.out.println("<---Notificacion: " + msg + "--->");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Tipo de notificacion: " + tipoDeNotificacion);
        newNotify.showInfo4();
    }

    @Override
    public void update5(String msg, Notify newNotify) {
        System.out.println("<---Notificacion: " + msg + "--->");
        System.out.println("Persona: " + persona.getName());
        System.out.println("Tipo de notificacion: " + tipoDeNotificacion);
        newNotify.showInfo5();
    }
}
