public class Client {
    public static void main(String[] args){
        CanalTel canal = new CanalTel();
        canal.attach(new UserTel("premios y pomos", new Persona("Juan", 123456789)));
        canal.attach(new UserTel("noticia", new Persona("Pedro", 135792468)));
        canal.attach(new UserTel("toda la informacion", new Persona("Maria", 987654321)));
        canal.attach(new UserTel("promos y noticia", new Persona("Ana", 987654321)));
        canal.attach(new UserTel("llamadas y premios", new Persona("Juan", 123456789)));

        canal.upload(new Notify("$0.50", "recarga una tarjeta de cualqueir valor y te regalamos el doble", "paquetes ilimitados de internet por 56 horas", 
        "estudiantes ahora pasan clases semipresencial", "toda la informacion"));
    }
}
